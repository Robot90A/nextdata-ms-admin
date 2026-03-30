package cod.ms.admin.mapper;

import cod.ms.admin.Dto.Request.ClienteRequest;
import cod.ms.admin.Dto.Response.ClienteResponse;
import cod.ms.admin.Entity.Cliente;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface NextDaataMapper {

    public Cliente clienteEntity(ClienteRequest request);

    public ClienteResponse clienteResponse(Cliente entity);

    public List<ClienteResponse> listaResponse(List<Cliente> entity);

}
