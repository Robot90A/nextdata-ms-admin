package cod.ms.admin.Repository;

import cod.ms.admin.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Long, Cliente> {

}
