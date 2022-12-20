package com.crud.h2.dto;


import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="usuarios")

@Inheritance(strategy=InheritanceType.JOINED)
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_usuario;
	@Column(name = "usuario")
	private String usuario;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellidos")
	private String apellidos;
	@Column(name = "fecha_nacimiento")
	private Date fecha_nacimiento;
	@Column(name = "correo")
	private String correo;
	@Column(name = "ciudad")
	private String ciudad;
	@Column(name = "fotoPerfil")
	private String fotoPerfil;
	@Column(name = "contraseña")
	private String contraseña;
	

	@OneToMany(mappedBy= "usuarios", cascade=CascadeType.ALL,  orphanRemoval = true)
	private List<UserRoles> roles;

	
	@OneToMany(mappedBy = "usuario", cascade=CascadeType.ALL,  orphanRemoval = true)
	//@JoinColumn(name = "ID_usuario")
	private List<Reserva> reservas;
	
	@OneToMany(mappedBy = "usuarios", cascade=CascadeType.ALL,  orphanRemoval = true)
	private List<Chollo> chollo;
	
	
	

	
	public Usuario(String usuario, String contraseña) {
		this.contraseña = contraseña;
		this.usuario = usuario;
	}
	
	//
	public Usuario() {
		
	}
	/**
	 * @param id
	 * @param nombre
	 * @param apellidos
	 * @param fecha
	 * @param correo
	 * @param ciudad
	 * @param foto_perfil
	 */

	public Usuario(int id_usuario, String usuario, String nombre, String apellidos, Date fecha_nacimiento,
			String correo, String ciudad, String fotoPerfil, String contraseña) {
		this.id_usuario = id_usuario;
		this.usuario = usuario;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha_nacimiento = fecha_nacimiento;
		this.correo = correo;
		this.ciudad = ciudad;
		this.fotoPerfil = fotoPerfil;
		this.contraseña = contraseña;
	}
	
	
	//Getters y Setters
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	* @return id_usuario
	*/
	public int getId() {
		return this.id_usuario;
	}

	/**
	* @param id
	*/
	public void setId(int id) {
		this.id_usuario = id;
	}

	/**
	* @return nombre
	*/
	public String getNombre() {
		return this.nombre;
	}

	/**
	* @param nombre
	*/
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	* @return apellidos
	*/
	public String getApellidos() {
		return this.apellidos;
	}

	/**
	* @param apellidos
	*/
	public void setApellido(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
	/**
	* @return fecha_nacimiento
	*/
	
	public Date getFechaNacimiento() {
		return this.fecha_nacimiento;
	}

	/**
	* @param fecha
	*/
	public void setFechaNacimiento(Date fecha) {
		this.fecha_nacimiento = fecha;
	}
	
	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	/**
	* @return correo
	*/
	public String getCorreo() {
		return this.correo;
	}

	/**
	* @param correo
	*/
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	/**
	* @return ciudad
	*/
	public String getCiudad() {
		return this.ciudad;
	}

	/**
	* @param ciudad
	*/
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	* @return foto_perfil
	*/
	public String getFotoPerfil() {
		return this.fotoPerfil;
	}

	/**
	* @param foto_perfil
	*/
	public void setFotoPerfil(String foto_perfil) {
		this.fotoPerfil = foto_perfil;
	}
	
	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}
	
	

	@JsonIgnore
	public List<Reserva> getReservas() {
		return reservas;
	}
	
	public void setChollos(List<Chollo> chollo) {
		this.chollo = chollo;
	}
	
	

	@JsonIgnore
	public List<Chollo> getChollo() {
		return chollo;
	}

	
	@JsonIgnore
	public List<UserRoles> getUserRoles() {
		return roles;
	}

	public void setUserRoles(List<UserRoles> roles) {
		this.roles = roles;
	}
	


	


	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", usuario=" + usuario + ", nombre=" + nombre + ", apellidos="
				+ apellidos + ", fecha_nacimiento=" + fecha_nacimiento + ", correo=" + correo + ", ciudad=" + ciudad
				+ ", fotoPerfil=" + fotoPerfil + ", contraseña=" + contraseña + ", roles=" + roles + ", reservas="
				+ reservas + "]";
	}
}
