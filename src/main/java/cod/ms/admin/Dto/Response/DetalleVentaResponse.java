package cod.ms.admin.Dto.Response;

public class DetalleVentaResponse {
	
    private Long idDetalle;
    
    private Long idVenta;

    private Long idProducto;

    private int cantidad;

	public DetalleVentaResponse(Long idDetalle, Long idVenta, Long idProducto, int cantidad) {
		super();
		this.idDetalle = idDetalle;
		this.idVenta = idVenta;
		this.idProducto = idProducto;
		this.cantidad = cantidad;
	}
	
	public DetalleVentaResponse() {
		
	}

	public Long getIdDetalle() {
		return idDetalle;
	}

	public void setIdDetalle(Long idDetalle) {
		this.idDetalle = idDetalle;
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
		return "DetalleVentaResponse [idDetalle=" + idDetalle + ", idVenta=" + idVenta + ", idProducto=" + idProducto
				+ ", cantidad=" + cantidad + "]";
	}
	
}
