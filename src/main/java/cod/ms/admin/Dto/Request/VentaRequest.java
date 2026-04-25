package cod.ms.admin.Dto.Request;

import java.time.LocalDate;
import java.util.List;

public class VentaRequest {
	
	private String cedula;
    private String nombre;
    private String correo;
    private String telefono;
    private Integer edad;
    private List<DetalleVentaRequest> detalles;
    private LocalDate fecha_venta;
    

	public List<DetalleVentaRequest> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<DetalleVentaRequest> detalles) {
		this.detalles = detalles;
	}

	public VentaRequest() {
		
		
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}


	public LocalDate getFecha_venta() {
		return fecha_venta;
	}

	public void setFecha_venta(LocalDate fecha_venta) {
		this.fecha_venta = fecha_venta;
	}

	@Override
	public String toString() {
		return "VentaRequest [cedula=" + cedula + ", nombre=" + nombre + ", correo=" + correo + ", telefono=" + telefono
				+ ", edad=" + edad + ", detalles=" + detalles + ", fecha_venta=" + fecha_venta + "]";
	}

}
