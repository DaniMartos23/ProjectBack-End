package com.crud.h2.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name = "chollo")
public class Chollo {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int ID_chollo;	
		
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha_caducidad;	
	@Column(name = "titulo")
	private String titulo;
	@Column(name = "precio")
	private int precio;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "valoracion")
	private int valoracion;	
	@Column(name = "unidades")
	private int unidades;
	@Column(name = "image_url")
	private String image_url;
	

	@ManyToOne
    @JoinColumn(name = "ID_viaje")
	Viajes viajes;

    @ManyToOne
    @JoinColumn(name = "ID_usuario")
    Usuario usuarios;
	
	@OneToMany(mappedBy= "chollo", cascade=CascadeType.ALL,  orphanRemoval = true)
	//@JoinColumn(name = "ID_chollo")
	private List<Reserva> reservas;
	
	

	public Chollo() {}



	public Chollo(int iD_chollo, Date fecha_caducidad, String titulo, int precio, String descripcion, int valoracion,
			int unidades, Viajes viajes,String image_url, Usuario usuarios) {
		
		ID_chollo = iD_chollo;
		this.fecha_caducidad = fecha_caducidad;
		this.titulo = titulo;
		this.precio = precio;
		this.descripcion = descripcion;
		this.valoracion = valoracion;
		this.unidades = unidades;
		this.viajes = viajes;
		this.usuarios = usuarios;
		this.image_url = image_url;
	}
 
	

	public Usuario getUsuario() {
		return usuarios;
	}



	public void setUsuario(Usuario usuarios) {
		this.usuarios = usuarios;
	}



	public int getID_chollo() {
		return ID_chollo;
	}




	public void setID_chollo(int iD_chollo) {
		ID_chollo = iD_chollo;
	}




	public Date getFecha() {
		return fecha_caducidad;
	}




	public void setFecha(Date fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}




	public String getTitulo() {
		return titulo;
	}




	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}




	public int getPrecio() {
		return precio;
	}




	public void setPrecio(int precio) {
		this.precio = precio;
	}




	public String getDescripcion() {
		return descripcion;
	}




	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}




	public int getValoracion() {
		return valoracion;
	}




	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}




	public int getUnidades() {
		return unidades;
	}




	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}




	public Viajes getViajes() {
		return viajes;
	}




	public Date getFecha_caducidad() {
		return fecha_caducidad;
	}



	public void setFecha_caducidad(Date fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}



	public String getImage_url() {
		return image_url;
	}



	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}



	public void setViajes(Viajes viajes) {
		this.viajes = viajes;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY)
	public List<Reserva> getReserva() {
		return reservas;
	}

	public void setReserva(List<Reserva> reservas) {
		this.reservas = reservas;
	}


	
	
	
}
