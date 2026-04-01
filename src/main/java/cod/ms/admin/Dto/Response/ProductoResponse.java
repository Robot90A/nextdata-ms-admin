package cod.ms.admin.Dto.Response;

public class ProductoResponse {

	private Long idProducto;

	private String nombreProducto;

	private Long idTipo;

	public ProductoResponse(Long idProducto, String nombreProducto, Long idTipo) {
		super();
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.idTipo = idTipo;
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
		return "ProductoResponse [idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", idTipo="
				+ idTipo + "]";
	}
	
}
