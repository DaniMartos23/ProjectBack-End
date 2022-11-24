package com.crud.h2.dto;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "administradores")
@PrimaryKeyJoinColumn(name = "ID_usuario")
public class administradores extends Usuario{
	
	@Column(name = "empresa")
	private String empresa;
	
	@OneToMany
	@JoinColumn(name = "ID_usuario")
	private List<Chollo> chollos;
	
	

	
	public administradores() {
		
	}


	
	
	public administradores(int id, String nombre, String apellidos, Date fecha, String correo, String ciudad, String foto_perfil,List<Reserva> reservas, String empresa, List<Chollo> chollo ) {
		super(id,nombre,apellidos,fecha,correo,ciudad,foto_perfil,reservas);
		this.empresa = empresa;
		this.chollos = chollo;
	}




	

	public String getEmpresa() {
		return empresa;
	}




	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "administradores")
	public List<Chollo> getChollo() {
		return chollos;
	}




	public void setChollo(List<Chollo> chollo) {
		this.chollos = chollo;
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
		super.setId(id);;
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
		super.setNombre(nombre);;
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
		super.setApellido(apellidos);;
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
		super.setFechaNacimiento(fecha);;
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
		super.setCorreo(correo);;
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
		super.setCiudad(ciudad);;
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
		super.setFotoPerfil(foto_perfil);;
	}
	
	
	public void setReservas(List<Reserva> reservas) {
		super.setReservas(reservas);;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "reserva")
	public List<Reserva> getReservas() {
		return super.getReservas();
	}

	//toString
	@Override
	public String toString() {
		String frase=super.toString();
		frase=frase.substring(0,frase.length()-1);
		return frase+", chollo="+chollos+", empresa="+empresa+"]";
	}
	
	
}
