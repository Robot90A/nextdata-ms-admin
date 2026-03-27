package cod.ms.admin.Repository;

import cod.ms.admin.Entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Long, Producto> {
}
