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
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Viajes")
public class Viajes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Viajes;	
	
	
	@ManyToOne
	@JoinColumn(name = "ID_Hotel")	
	
	@ManyToOne
	@JoinColumn(name = "ID_Vuelos")
	
	@Column(name = "origen")
	private String origen;
	@Column(name = "destino")
	private String destino;

	
	public Viajes() {
		
	}

	public Viajes(int id, String origen, String destino) {
		super();
		this.ID_Viajes = id;
		this.origen = origen;
		this.destino = destino;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.ID_Viajes = id;
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
		return "Viajes [id=" + ID_Viajes + ", origen=" + origen + ", destino=" + destino + "]";
	}
	
	
}