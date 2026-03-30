package cod.ms.admin.Service;

import cod.ms.admin.Dto.Request.ClienteRequest;
import cod.ms.admin.Dto.Response.ClienteResponse;
import cod.ms.admin.Entity.Cliente;
import cod.ms.admin.Repository.ClienteRepository;
import cod.ms.admin.mapper.NextDaataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceNextDataImp implements ServiceNextData {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private NextDaataMapper nextDaataMapper;

    @Override
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
}
