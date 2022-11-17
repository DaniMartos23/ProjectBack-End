package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.dto.Equipo;
import com.example.demo.dto.Investigador;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Viajes")
public class Viajes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Viajes;	
	
	
	@ManyToOne
	@JoinColumn(name = "ID_Hotel")
	private Hotel Hotel;
	
	@ManyToOne
	@JoinColumn(name = "ID_Vuelos")
	private Vuelos Vuelos;
	
	@Column(name = "origen")
	private String origen;
	@Column(name = "destino")
	private String destino;

	
	public Viajes() {
		
	}

	public Viajes(int id, Hotel Hotel, Vuelos Vuelos,  String origen, String destino) {
		super();
		this.ID_Viajes = id;
		this.Hotel= Hotel;
		this.Vuelos = Vuelos;		
		this.origen = origen;
		this.destino = destino;		
		
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}
	public Hotel getHotel() {
		return Hotel;
	}

	public void setHotel (Hotel Hotel) {
		this.Hotel= Hotel;
	}
	public Vuelos getVuelos() {
		return Vuelos;
	}

	public void setVuelos (Vuelos Vuelos) {
		this.Vuelos= Vuelos;
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
	
	//toString
	@Override
	public String toString() {
		return "Viajes [id=" + ID_Viajes +",Hotel="+ Hotel +"Vuelos="+ Vuelos + ", origen=" + origen + ", destino=" + destino + "]";
	}
	
	
}