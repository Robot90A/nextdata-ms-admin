package cod.ms.admin.Dto.Request;

import java.time.LocalDate;

public class VentaRequest {
	
	private String cedula;
    private String nombre;
    private String correo;
    private String telefono;
    private int edad;
    private Long productoId;
    private int cantidad;
    private LocalDate fecha_venta;
    
	public VentaRequest(String cedula, String nombre, String correo, String telefono, int edad, Long productoId,
			int cantidad, LocalDate fecha_venta) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.correo = correo;
		this.telefono = telefono;
		this.edad = edad;
		this.productoId = productoId;
		this.cantidad = cantidad;
		this.fecha_venta = fecha_venta;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Long getProductoId() {
		return productoId;
	}

	public void setProductoId(Long productoId) {
		this.productoId = productoId;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
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
				+ ", edad=" + edad + ", productoId=" + productoId + ", cantidad=" + cantidad + ", fecha_venta="
				+ fecha_venta + "]";
	}
}
