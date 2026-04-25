package cod.ms.admin.Dto.Request;

public class DetalleVentaRequest {
	

    private Long idProducto;

    private Integer cantidad;

	public DetalleVentaRequest(Long idVenta, Long idProducto, int cantidad) {
		super();
		this.idProducto = idProducto;
		this.cantidad = cantidad;
	}
	
	public DetalleVentaRequest() {
		
		
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "DetalleVentaRequest [idProducto=" + idProducto + ", cantidad=" + cantidad + "]";
	}

}
