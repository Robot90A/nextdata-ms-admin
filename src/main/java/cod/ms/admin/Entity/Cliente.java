package cod.ms.admin.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private Long idCliente;
	
	@Column(name = "cedula")
	private String cedula;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "correo")
	private String correo;
	
	@Column(name = "telefono")
	private String telefono;
	
    @Column(name = "edad")
	private int edad;

	public Cliente(Long idCliente, String cedula, String nombre, String correo, String telefono, int edad) {
		this.idCliente = idCliente;
		this.cedula = cedula;
		this.nombre = nombre;
		this.correo = correo;
		this.telefono = telefono;
		this.edad = edad;
	}

	public Cliente(){


	}


	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
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

	@Override
	public String toString() {
		return "Cliente{" +
				"idCliente=" + idCliente +
				", cedula='" + cedula + '\'' +
				", nombre='" + nombre + '\'' +
				", correo='" + correo + '\'' +
				", telefono='" + telefono + '\'' +
				", edad=" + edad +
				'}';
	}
}
