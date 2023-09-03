package co.edu.sena.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Users")
public class User {

	@Id
	@Column(name="id_use")
	  private  int id;
	
	@Column(name="email_use")
	  private String email;
	
	@Column(name="nom_use")
	  private String nombre;
	
	@Column(name="ape_use")
	  private String apellido;
	
	@Column(name="fchc_use")
	  private String fechaContratacion;
	
	@Column(name="rol_use")
	  private String rol;
	  
	public User(int id, String email, String nombre, String apellido, String fechaContratacion, String rol) {
		
		this.id = id;
		this.email = email;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaContratacion = fechaContratacion;
		this.rol = rol;
	}
	
	public User() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getFechaContratacion() {
		return fechaContratacion;
	}
	public void setFechaContratacion(String fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	  
	  
}
