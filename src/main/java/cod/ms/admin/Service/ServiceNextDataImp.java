package cod.ms.admin.Service;

import cod.ms.admin.Dto.Request.ClienteRequest;
import cod.ms.admin.Dto.Request.ProductoRequest;
import cod.ms.admin.Dto.Request.TipoProductoRequest;
import cod.ms.admin.Dto.Response.ClienteResponse;
import cod.ms.admin.Dto.Response.ProductoResponse;
import cod.ms.admin.Dto.Response.TipoProductoResponse;
import cod.ms.admin.Entity.Cliente;
import cod.ms.admin.Entity.Producto;
import cod.ms.admin.Entity.TipoProducto;
import cod.ms.admin.Repository.ClienteRepository;
import cod.ms.admin.Repository.ProductoRepository;
import cod.ms.admin.Repository.TipoProductoRepository;
import cod.ms.admin.mapper.NextDaataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
}
