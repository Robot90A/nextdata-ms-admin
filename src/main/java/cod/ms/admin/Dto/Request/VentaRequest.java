package cod.ms.admin.Dto.Request;

import java.time.LocalDate;

public class VentaRequest {
	
	private Long idCliente;

	private LocalDate fecha_venta;

	public VentaRequest(Long idCliente, LocalDate fecha_venta) {
		super();
		this.idCliente = idCliente;
		this.fecha_venta = fecha_venta;
	}
	
	public VentaRequest() {
		
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
		return "VentaRequest [idCliente=" + idCliente + ", fecha_venta=" + fecha_venta + "]";
	}
	
}
