package cod.ms.admin.Service;

import cod.ms.admin.Dto.Request.ClienteRequest;
import cod.ms.admin.Dto.Request.ProductoRequest;
import cod.ms.admin.Dto.Request.TipoProductoRequest;
import cod.ms.admin.Dto.Request.VentaRequest;
import cod.ms.admin.Dto.Response.ClienteResponse;
import cod.ms.admin.Dto.Response.ProductoResponse;
import cod.ms.admin.Dto.Response.TipoProductoResponse;

import java.util.List;

public interface ServiceNextData {

	public List<ClienteResponse> optenerTodosLosClientes();

	public ClienteResponse guardarCliente(ClienteRequest request);

	public ClienteResponse buscarClientePorID(Long id);
	
	public ClienteResponse buscarClientePorCedula(String cedula);

	public void eliminarClientePorID(Long id);

	public List<TipoProductoResponse> optenerTodosLosTiposDeProductos();

	public TipoProductoResponse guardarTipoProductosResponse(TipoProductoRequest request);

	public List<ProductoResponse> optenerTodosLosProductos();

	public ProductoResponse guardarProductosResponse(ProductoRequest rquest);
	
	public void guardarVentaResponse(VentaRequest request);

}
