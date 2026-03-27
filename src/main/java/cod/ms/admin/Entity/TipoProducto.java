package cod.ms.admin.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "tipo_producto")
@Entity
@Data
public class TipoProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo")
    private Long idTipo;

    @Column(name = "nombre_tipo")
    private String nombreTipo;

}
