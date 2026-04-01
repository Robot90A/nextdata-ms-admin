package cod.ms.admin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import cod.ms.admin.Entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
	

}
