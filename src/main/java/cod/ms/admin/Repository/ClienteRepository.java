package cod.ms.admin.Repository;

import cod.ms.admin.Entity.Cliente;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	//select * from Cliente where cedula = "?"
	Optional<Cliente> findByCedula(String cedula);

}
