package cod.ms.admin.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "producto")

public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto;

    @Column(name = "nombre_producto")
    private String nombreProducto;

    @Column(name = "id_tipo")
    private Long idTipo;

	public Producto(Long idProducto, String nombreProducto, Long idTipo) {
		super();
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.idTipo = idTipo;
	}
	
	public Producto() {
		
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Long getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(Long idTipo) {
		this.idTipo = idTipo;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", idTipo=" + idTipo + "]";
	}
	
	
}
