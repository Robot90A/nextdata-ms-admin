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

    @Override
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
}
