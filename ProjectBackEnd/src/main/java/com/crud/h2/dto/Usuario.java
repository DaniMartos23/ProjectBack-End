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
	
	@OneToMany(mappedBy = "usuario", cascade=CascadeType.ALL,  orphanRemoval = true)
	//@JoinColumn(name = "ID_usuario")
	private List<Reserva> reservas;
	

	
	public Usuario(String nombre, String contraseña) {
		this.contraseña = contraseña;
		this.nombre = nombre;
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
	public Usuario(int id, String nombre, String apellidos, Date fecha, String correo, String ciudad, String foto_perfil,List<Reserva> reservas) {
		//super();
		this.id_usuario = id;
		this.nombre = nombre;
		this.fecha_nacimiento=fecha;
		this.correo=correo;
		this.ciudad=ciudad;
		this.fotoPerfil=foto_perfil;
		this.reservas=reservas;
	}
	
	
	//Getters y Setters
	
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
	@OneToMany(fetch = FetchType.LAZY)
	public List<Reserva> getReservas() {
		return reservas;
	}

	
	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Cliente [id=" + this.id_usuario + ", nombre=" + this.nombre 
				+ ", apellidos=" + this.apellidos + ", fecha nacimiento=" + this.fecha_nacimiento
				+ ", correo=" + this.correo +  ", ciudad=" + this.ciudad + ", foto de perfil=" 
				+ this.fotoPerfil +", Reserva="+reservas+"]";
	}
}
