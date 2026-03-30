package cod.ms.admin.Controller;

import cod.ms.admin.Dto.Request.ClienteRequest;
import cod.ms.admin.Dto.Response.ClienteResponse;
import cod.ms.admin.Service.ServiceNextData;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Clientes", description = "Operaciones relacionadas con clientes")
@RestController
@RequestMapping(value = "/nextdata")
public class NextDataController {

    private ServiceNextData serviceNextData;

    public NextDataController(ServiceNextData serviceNextData){

        this.serviceNextData = serviceNextData;
    }

    @Operation(summary = "Listar clientes", description = "Obtiene todos los clientes registrados")
    @GetMapping(value = "/lista")
    public ResponseEntity<List<ClienteResponse>> optenerListaDeLosClientes(){

        List<ClienteResponse> listaClientesResponse = serviceNextData.optenerTodosLosClientes();

        return ResponseEntity.ok(listaClientesResponse);
    }

    @Operation(summary = "Guardar cliente", description = "Crea un nuevo cliente en la base de datos")
    @PostMapping(value = "/guardar")
    public ResponseEntity<ClienteResponse> guardarCliente(@RequestBody ClienteRequest request){

        ClienteResponse clienteGuardado = serviceNextData.guardarCliente(request);

        return ResponseEntity.ok(clienteGuardado);

    }

    @Operation(summary = "Buscar cliente", description = "Buscar un cliente por su id")
    @GetMapping(value = "/buscarID/{id}")
    public ResponseEntity<ClienteResponse> buscarClientePorSuID(@PathVariable Long id){

        ClienteResponse clienteID = serviceNextData.buscarClientePorID(id);

        return ResponseEntity.ok(clienteID);

    }

    @Operation(summary = "Eliminar cliente ", description = "Elimina un cliente por su id")
    @DeleteMapping(value = "/eliminar/{id}")
    public ResponseEntity<Void> eliminarClientePorSuID(@PathVariable Long id){

        serviceNextData.eliminarClientePorID(id);

        return ResponseEntity.noContent().build();

    }
}
