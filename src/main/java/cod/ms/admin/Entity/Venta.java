package cod.ms.admin.Entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "venta")
@Data
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private Long idVenta;

    @Column(name = "id_cliente")
    private Long idCliente;

    @Column(name = "fecha_venta")
    private LocalDate fecha_venta;

}
