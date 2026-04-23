package cod.ms.admin.Service;

import cod.ms.admin.Dto.Request.ClienteRequest;
import cod.ms.admin.Dto.Request.ProductoRequest;
import cod.ms.admin.Dto.Request.TipoProductoRequest;
import cod.ms.admin.Dto.Request.VentaRequest;
import cod.ms.admin.Dto.Response.ClienteResponse;
import cod.ms.admin.Dto.Response.ProductoResponse;
import cod.ms.admin.Dto.Response.TipoProductoResponse;
import cod.ms.admin.Entity.Cliente;
import cod.ms.admin.Entity.DetalleVenta;
import cod.ms.admin.Entity.Producto;
import cod.ms.admin.Entity.TipoProducto;
import cod.ms.admin.Entity.Venta;
import cod.ms.admin.Repository.ClienteRepository;
import cod.ms.admin.Repository.DetalleVentaRepository;
import cod.ms.admin.Repository.ProductoRepository;
import cod.ms.admin.Repository.TipoProductoRepository;
import cod.ms.admin.Repository.VentaRepository;
import cod.ms.admin.mapper.NextDaataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceNextDataImp implements ServiceNextData {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private TipoProductoRepository tipoProductoRepository;

    @Autowired
    private NextDaataMapper nextDaataMapper;
    
    @Autowired
    private ProductoRepository productoRepository;
    
    @Autowired
    private VentaRepository ventaRepository;
    
    @Autowired
    private DetalleVentaRepository detalleVentaRepository;


	@Override
	@Transactional(readOnly = true)
	public List<ClienteResponse> optenerTodosLosClientes() {

		List<Cliente> listaDeClientes = clienteRepository.findAll();

		return nextDaataMapper.listaResponse(listaDeClientes);
	}

    @Override
    public ClienteResponse guardarCliente(ClienteRequest request) {

        Cliente cliente = nextDaataMapper.clienteEntity(request);

        cliente = clienteRepository.save(cliente);

        return nextDaataMapper.clienteResponse(cliente);

    }

    @Override
    @Transactional(readOnly = true)
    public ClienteResponse buscarClientePorID(Long id) {

        Cliente clienteid = clienteRepository.findById(id).orElse(null);

        if (clienteid == null) {
            throw new RuntimeException("Cliente no encontrado");
        }

        return nextDaataMapper.clienteResponse(clienteid);

    }

    @Override
    public void eliminarClientePorID(Long id) {

        Cliente clienteID = clienteRepository.findById(id).orElse(null);

        if(clienteID != null){

            clienteRepository.delete(clienteID);

        }else{

            throw new RuntimeException("El Cliente no existe");
        }
    }

    @Transactional(readOnly = true)
    @Override
    public List<TipoProductoResponse> optenerTodosLosTiposDeProductos() {

        List<TipoProducto> listaDeTiposProductos = tipoProductoRepository.findAll();

        return nextDaataMapper.listaTipoProductoResponse(listaDeTiposProductos);
    }

    @Override
    public TipoProductoResponse guardarTipoProductosResponse(TipoProductoRequest request) {

        TipoProducto tipoProductoEntity = nextDaataMapper.tipoProductoEntity(request);

        tipoProductoEntity = tipoProductoRepository.save(tipoProductoEntity);

        return nextDaataMapper.tipoProductoResponse(tipoProductoEntity);
    }
    
    @Transactional(readOnly = true)
	@Override
	public List<ProductoResponse> optenerTodosLosProductos() {
		
		List<Producto> listaProducto = productoRepository.findAll();
	
		return nextDaataMapper.listarProductosResponse(listaProducto);
	}
    
    
	@Override
	public ProductoResponse guardarProductosResponse(ProductoRequest rquest) {
		
		Producto guardarProducto = nextDaataMapper.productoEntity(rquest);
		
		guardarProducto = productoRepository.save(guardarProducto);
		
		return nextDaataMapper.productoResponse(guardarProducto);
	}
    
	@Transactional(readOnly = true)
	@Override
	public ClienteResponse buscarClientePorCedula(String cedula) {
		
		Cliente cliente = clienteRepository.findByCedula(cedula).orElse(null);
		
		if(cliente == null) {
			
			throw new RuntimeException("Cliente no encontrado por cedula");
		}
		
		return nextDaataMapper.clienteResponse(cliente);
		
	}

	@Override
	public void guardarVentaResponse(VentaRequest request) {
		
		//Buscar o crear cliente
	    Cliente cliente = clienteRepository.findByCedula(request.getCedula())
	            .orElse(null);

	    if (cliente == null) {
	        cliente = new Cliente();
	        cliente.setCedula(request.getCedula());
	        cliente.setNombre(request.getNombre());
	        cliente.setCorreo(request.getCorreo());
	        cliente.setTelefono(request.getTelefono());
	        cliente.setEdad(request.getEdad());

	        cliente = clienteRepository.save(cliente);
	    }

	    //Crear venta
	    Venta venta = new Venta();
	    venta.setIdCliente(cliente.getIdCliente());
	    venta.setFecha_venta(request.getFecha_venta());

	    venta = ventaRepository.save(venta);

	    //Validar producto
	    Optional<Producto> productoOpt = productoRepository.findById(request.getProductoId());

	    if (!productoOpt.isPresent()) {
	        throw new RuntimeException("Producto no encontrado");
	    }

	    //Crear detalle
	    DetalleVenta detalle = new DetalleVenta();
	    detalle.setIdVenta(venta.getIdVenta());
	    detalle.setIdProducto(request.getProductoId());
	    detalle.setCantidad(request.getCantidad());

	    detalleVentaRepository.save(detalle);
		
	}

}
