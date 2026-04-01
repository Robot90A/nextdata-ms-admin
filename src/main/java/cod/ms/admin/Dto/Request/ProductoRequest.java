package cod.ms.admin.Dto.Request;

public class ProductoRequest {

	private String nombreProducto;

	private Long idTipo;

	public ProductoRequest(String nombreProducto, Long idTipo) {
		super();
		this.nombreProducto = nombreProducto;
		this.idTipo = idTipo;
	}

	public ProductoRequest() {

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
		return "ProductoRequest [nombreProducto=" + nombreProducto + ", idTipo=" + idTipo + "]";
	}

}
