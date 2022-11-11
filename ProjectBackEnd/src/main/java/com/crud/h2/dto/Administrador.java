package com.crud.h2.dto;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="administradores")
public class Administrador extends Usuario {
	
	
	@Column(name = "empresa")
	private String empresa;
	
	@ManyToOne()
	@JoinColumn(name = "ID_usuario")
    private Usuario usuario;
	

	
	public Administrador() {
		
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
	public Administrador(int id, String nombre, String apellidos, Date fecha, String correo, String ciudad, String foto_perfil,String empresa) {
		super(id,nombre,apellidos,fecha,correo,ciudad,foto_perfil);
		this.empresa=empresa;
	}
	
	
	//Getters y Setters
	
	/**
	* @return id_usuario
	*/
	public int getId() {
		return super.getId();
	}

	/**
	* @param id
	*/
	public void setId(int id) {
		super.setId(id);
	}

	/**
	* @return nombre
	*/
	public String getNombre() {
		return super.getNombre();
	}

	/**
	* @param nombre
	*/
	public void setNombre(String nombre) {
		super.setNombre(nombre);
	}

	/**
	* @return apellidos
	*/
	public String getApellidos() {
		return super.getApellidos();
	}

	/**
	* @param apellidos
	*/
	public void setApellido(String apellidos) {
		super.setApellido(apellidos);
	}
	
	
	/**
	* @return fecha_nacimiento
	*/
	
	public Date getFechaNacimiento() {
		return super.getFechaNacimiento();
	}

	/**
	* @param fecha
	*/
	public void setFechaNacimiento(Date fecha) {
		super.setFechaNacimiento(fecha);
	}
	
	/**
	* @return correo
	*/
	public String getCorreo() {
		return super.getCorreo();
	}

	/**
	* @param correo
	*/
	public void setCorreo(String correo) {
		super.setCorreo(correo);
	}
	
	/**
	* @return ciudad
	*/
	public String getCiudad() {
		return super.getCiudad();
	}

	/**
	* @param ciudad
	*/
	public void setCiudad(String ciudad) {
		super.setCiudad(ciudad);
	}

	/**
	* @return foto_perfil
	*/
	public String getFotoPerfil() {
		return super.getFotoPerfil();
	}

	/**
	* @param foto_perfil
	*/
	
	
	public void setFotoPerfil(String foto_perfil) {
		super.setFotoPerfil(foto_perfil);
	}

	
	/**
	* @return empresa
	*/
	public String getEmpresa() {
		return this.empresa;
	}
	
	/**
	* @param empresa
	*/
	public void setEmpresa(String empresa) {
		this.empresa=empresa;
	}
	
	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		String cadena=super.toString();
		return cadena.substring(0,cadena.length()-1)+", empresa= "+this.empresa+"]";
	}
}
