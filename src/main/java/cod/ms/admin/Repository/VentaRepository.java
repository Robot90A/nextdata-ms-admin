package cod.ms.admin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cod.ms.admin.Entity.Venta;

public interface VentaRepository extends JpaRepository<Venta, Long> {
	

}
