package com.crud.h2.dto;

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
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "viajes")
public class Viajes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int ID_viaje;	
	
	
	@ManyToOne
	@JoinColumn(name = "ID_hotel")
	private Hotel hotel;
	
	@ManyToOne
	@JoinColumn(name = "ID_vuelo")
	private Vuelos vuelos;
	
	@OneToMany(mappedBy= "viajes", cascade=CascadeType.ALL,  orphanRemoval = true)
	//@JoinColumn(name = "ID_viaje")
	private List<Chollo> chollos;
	
	
	@Column(name = "origen")
	private String origen;
	@Column(name = "destino")
	private String destino;

	
	public Viajes() {
		
	}

	public Viajes(int id, Hotel Hotel, Vuelos Vuelos,  String origen, String destino, List<Chollo> chollos) {
		super();
		this.ID_viaje = id;
		this.hotel= Hotel;
		this.vuelos = Vuelos;		
		this.origen = origen;
		this.destino = destino;	
		this.chollos = chollos;
		
	}

	public int getid() {
		return ID_viaje;
	}

	public void setid(int id) {
		this.ID_viaje = id;
	}
	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel (Hotel Hotel) {
		this.hotel= Hotel;
	}
	public Vuelos getVuelos() {
		return vuelos;
	}

	public void setVuelos (Vuelos Vuelos) {
		this.vuelos= Vuelos;
	}

	public String getorigen() {
		return origen;
	}

	public void setorigen(String origen) {
		this.origen = origen;
	}

	public String getdestino() {
		return destino;
	}

	public void setdestino(String destino) {
		this.destino = destino;
	}
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY)
	public List<Chollo> getchollos() {
		return chollos;
	}

	public void setchollos(List<Chollo> chollos) {
		this.chollos = chollos;
	}
	//toString
	@Override
	public String toString() {
		return "Viajes [id=" + ID_viaje +",Hotel="+ hotel +"Vuelos="+ vuelos + ", origen=" + origen + ", destino=" + destino + "chollos="+ chollos + "]";
	}
	
	
}