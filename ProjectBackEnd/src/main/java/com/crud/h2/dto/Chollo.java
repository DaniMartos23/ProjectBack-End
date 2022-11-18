package com.crud.h2.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;


@Entity
@Table(name = "chollo")
public class Chollo {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int ID_chollo;	
		

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	@Column(name = "destino")
	private String titulo;
	
	@Column(name = "precio")
	private int precio;

	@Column(name = "descripcion")
	private String descripcion;

	@Column(name = "valoracion")
	private int valoracion;
	
	@Column(name = "unidades")
	private int unidades;
	

	@ManyToOne
    @JoinColumn(name = "ID_viaje")
	Viajes viajes;


    @ManyToOne
    @JoinColumn(name = "ID_administradores")
    Admin admin;
	

	
	

	public Chollo() {}



	public Chollo(int iD_chollo, Date fecha, String titulo, int precio, String descripcion, int valoracion,
			int unidades, Viajes viajes, Admin admin) {
		
		ID_chollo = iD_chollo;
		this.fecha = fecha;
		this.titulo = titulo;
		this.precio = precio;
		this.descripcion = descripcion;
		this.valoracion = valoracion;
		this.unidades = unidades;
		this.viajes = viajes;
		this.admin = admin;
	}
 
	

	public Admin getAdmin() {
		return admin;
	}



	public void setAdmin(Admin admin) {
		this.admin = admin;
	}



	public int getID_chollo() {
		return ID_chollo;
	}




	public void setID_chollo(int iD_chollo) {
		ID_chollo = iD_chollo;
	}




	public Date getFecha() {
		return fecha;
	}




	public void setFecha(Date fecha) {
		this.fecha = fecha;
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




	public void setViajes(Viajes viajes) {
		this.viajes = viajes;
	}




	
	
	
}
