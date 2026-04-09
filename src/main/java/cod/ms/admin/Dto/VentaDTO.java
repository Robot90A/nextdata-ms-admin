package cod.ms.admin.Dto;

import java.time.LocalDate;

public class VentaDTO {

	private Long idVenta;

	private Long idCliente;

	private LocalDate fecha_venta;

	public VentaDTO(Long idVenta, Long idCliente, LocalDate fecha_venta) {
		super();
		this.idVenta = idVenta;
		this.idCliente = idCliente;
		this.fecha_venta = fecha_venta;
	}

	public VentaDTO() {

	}

	public Long getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Long idVenta) {
		this.idVenta = idVenta;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public LocalDate getFecha_venta() {
		return fecha_venta;
	}

	public void setFecha_venta(LocalDate fecha_venta) {
		this.fecha_venta = fecha_venta;
	}

	@Override
	public String toString() {
		return "VentaDTO [idVenta=" + idVenta + ", idCliente=" + idCliente + ", fecha_venta=" + fecha_venta + "]";
	}

}
