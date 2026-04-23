package cod.ms.admin.Controller;

import cod.ms.admin.Dto.Request.ClienteRequest;
import cod.ms.admin.Dto.Request.ProductoRequest;
import cod.ms.admin.Dto.Request.TipoProductoRequest;
import cod.ms.admin.Dto.Request.VentaRequest;
import cod.ms.admin.Dto.Response.ClienteResponse;
import cod.ms.admin.Dto.Response.ProductoResponse;
import cod.ms.admin.Dto.Response.TipoProductoResponse;
import cod.ms.admin.Dto.Response.VentaResponse;
import cod.ms.admin.Service.ServiceNextData;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Clientes", description = "Operaciones relacionadas con clientes")
@RestController
@CrossOrigin(value = "http://localhost:4200")
@RequestMapping(value = "/nextdata")
public class NextDataController {

	private ServiceNextData serviceNextData;

	public NextDataController(ServiceNextData serviceNextData) {

		this.serviceNextData = serviceNextData;
	}

	@Operation(summary = "Listar clientes", description = "Obtiene todos los clientes registrados")
	@GetMapping(value = "/listarCliente")
	public ResponseEntity<List<ClienteResponse>> optenerListaDeLosClientes() {

		List<ClienteResponse> listaClientesResponse = serviceNextData.optenerTodosLosClientes();

		return new ResponseEntity<>(listaClientesResponse, HttpStatus.OK);
	}

	@Operation(summary = "Guardar cliente", description = "Crea un nuevo cliente en la base de datos")
	@PostMapping(value = "/guardarCliente")
	public ResponseEntity<ClienteResponse> guardarCliente(@RequestBody ClienteRequest request) {

		ClienteResponse clienteGuardado = serviceNextData.guardarCliente(request);

		return new ResponseEntity<>(clienteGuardado, HttpStatus.OK);

	}

	@Operation(summary = "Buscar cliente", description = "Buscar un cliente por su id")
	@GetMapping(value = "/buscarIDCliente/{id}")
	public ResponseEntity<ClienteResponse> buscarClientePorSuID(@PathVariable Long id) {

		ClienteResponse clienteID = serviceNextData.buscarClientePorID(id);

		return new ResponseEntity<>(clienteID, HttpStatus.OK);

	}

	@Operation(summary = "Eliminar cliente ", description = "Elimina un cliente por su id")
	@DeleteMapping(value = "/eliminarCliente/{id}")
	public ResponseEntity<Void> eliminarClientePorSuID(@PathVariable Long id) {

		serviceNextData.eliminarClientePorID(id);

		return ResponseEntity.noContent().build();

	}

	@Operation(summary = "Lista Tipo de Productos ", description = "Elimina un cliente por su id")
	@GetMapping(value = "/listaTipoProductos")
	public ResponseEntity<List<TipoProductoResponse>> optenerListaDeLosTiposDeProductos() {

		List<TipoProductoResponse> listaDeProductos = serviceNextData.optenerTodosLosTiposDeProductos();

		return new ResponseEntity<>(listaDeProductos, HttpStatus.OK);
	}

	@Operation(summary = "Guardar Los Tipos de productos", description = "Guarda los Tipos de Productos")
	@PostMapping(value = "/guardarTipoProducto")
	public ResponseEntity<TipoProductoResponse> guardarTipoProductos(@RequestBody TipoProductoRequest request) {

		TipoProductoResponse tipoProductoGuardado = serviceNextData.guardarTipoProductosResponse(request);

		return new ResponseEntity<>(tipoProductoGuardado, HttpStatus.OK);

	}
	
	@Operation(summary = "Listar productos", description = "Lista todo los productos disponibles")
	@GetMapping(value = "/listarProductos")
	public ResponseEntity<List<ProductoResponse>> optenerTodosLosProductos(){
		
		List<ProductoResponse> listaProductos = serviceNextData.optenerTodosLosProductos();
		
		return new ResponseEntity<>(listaProductos, HttpStatus.OK);
		
	}
	
	@Operation(summary = "Guardar productos", description = "Crea un nuevo Producto en la base de datos")
	@PostMapping(value = "/guardarProducto")
	public ResponseEntity<ProductoResponse> guardarProducto(@RequestBody ProductoRequest request){
		
		ProductoResponse productoGuardado = serviceNextData.guardarProductosResponse(request);
		
		return new ResponseEntity<>(productoGuardado, HttpStatus.OK);
		
	}
	
	@GetMapping(value = "/buscarCedula/{cedula}")
	public ResponseEntity<ClienteResponse> buscarClientePorCedula(@PathVariable String cedula){
		
		ClienteResponse clienteCedula = serviceNextData.buscarClientePorCedula(cedula);
		
		return new ResponseEntity<>(clienteCedula, HttpStatus.OK);
	}
	
	@Operation(summary = "Guardar Venta", description = "Guarda la venta del cliente")
	@PostMapping(value = "/guardarVenta")
	public ResponseEntity<Void> guardarVenta (@RequestBody VentaRequest request){
		
		serviceNextData.guardarVentaResponse(request);
		
		return ResponseEntity.noContent().build();
		
	}

}
