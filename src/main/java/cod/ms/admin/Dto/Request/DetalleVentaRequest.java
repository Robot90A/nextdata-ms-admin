package cod.ms.admin.Dto.Request;

public class DetalleVentaRequest {
	
    private Long idVenta;

    private Long idProducto;

    private int cantidad;

	public DetalleVentaRequest(Long idVenta, Long idProducto, int cantidad) {
		super();
		this.idVenta = idVenta;
		this.idProducto = idProducto;
		this.cantidad = cantidad;
	}
	
	public DetalleVentaRequest() {
		
		
	}

	public Long getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Long idVenta) {
		this.idVenta = idVenta;
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "DetalleVentaRequest [idVenta=" + idVenta + ", idProducto=" + idProducto + ", cantidad=" + cantidad
				+ "]";
	}

}
