package cod.ms.admin.mapper;

import cod.ms.admin.Dto.Request.ClienteRequest;
import cod.ms.admin.Dto.Request.ProductoRequest;
import cod.ms.admin.Dto.Request.TipoProductoRequest;
import cod.ms.admin.Dto.Response.ClienteResponse;
import cod.ms.admin.Dto.Response.ProductoResponse;
import cod.ms.admin.Dto.Response.TipoProductoResponse;
import cod.ms.admin.Entity.Cliente;
import cod.ms.admin.Entity.Producto;
import cod.ms.admin.Entity.TipoProducto;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface NextDaataMapper {

    public Cliente clienteEntity(ClienteRequest request);

    public ClienteResponse clienteResponse(Cliente entity);

    public List<ClienteResponse> listaResponse(List<Cliente> entity);

    public TipoProducto tipoProductoEntity(TipoProductoRequest request);

    public TipoProductoResponse tipoProductoResponse(TipoProducto entity);

    public List<TipoProductoResponse> listaTipoProductoResponse(List<TipoProducto> entity);
    
    public List<ProductoResponse> listarProductosResponse(List<Producto> entity);
    
    public Producto productoEntity(ProductoRequest request);
    
    public ProductoResponse productoResponse(Producto entity);
    
}
