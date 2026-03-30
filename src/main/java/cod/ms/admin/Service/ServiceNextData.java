package cod.ms.admin.Service;

import cod.ms.admin.Dto.Request.ClienteRequest;
import cod.ms.admin.Dto.Response.ClienteResponse;
import cod.ms.admin.Entity.Cliente;

import java.util.List;

public interface ServiceNextData {

    public List<ClienteResponse> optenerTodosLosClientes();

    public ClienteResponse guardarCliente(ClienteRequest request);

}
