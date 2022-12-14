package com.crud.h2.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="vuelos")
public class Vuelos {
	@Id	
	private int Id_vuelo;
	@Column(name = "aereolinea")//no hace falta si se llama igual
	private String aerolinea;
	@Column(name = "TipoAsiento")//no hace falta si se llama igual
	private String TipoAsiento;
	@Column(name = "maletas")
	private String maletas;
	@Column(name = "asignacion_asiento")
	private String asignacion_asiento;
	@Column(name = "duracion")
	private int duracion;
	@Column(name = "escalas")
	private String escalas;
	@Column(name = "origen")
	private String origen;
	@Column(name = "destino")
	private String destino;   
	
	
	@OneToMany(mappedBy = "vuelos", cascade=CascadeType.ALL,  orphanRemoval = true)
	//@JoinColumn(name = "ID_vuelos")
	private List<Viajes> Viaje;
	
	//contructores
	public Vuelos() {
		super();
	}

	public Vuelos(int id, String aerolinea, String TipoAsiento, String maletas, String asignacion_asiento, int duracion, String escalas,
			String origen, String destino,List<Viajes> Viaje ) {
		super();
		this.Id_vuelo = id;
		this.aerolinea = aerolinea;
		this.TipoAsiento = TipoAsiento;
		this.maletas = maletas;
		this.asignacion_asiento = asignacion_asiento;
		this.duracion = duracion;
		this.escalas = escalas;
		this.origen = origen;
		this.destino = destino;
		this.Viaje = Viaje;
		
	}

	//getters y setters
	
	public int getId() {
		return Id_vuelo ;
	}

	public void setId(int id) {
		this.Id_vuelo  = id;
	}

	public String getaerolinea() {
		return aerolinea;
	}

	public void setaerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}

	public String getTipoAsiento() {
		return TipoAsiento;
	}

	public void setTipoAsiento(String TipoAsiento) {
		this.TipoAsiento = TipoAsiento;
	}

	public String getmaletas() {
		return maletas;
	}

	public void setmaletas(String maletas) {
		this.maletas = maletas;
	}

	public String getasignacion_asiento() {
		return asignacion_asiento;
	}

	public void setasignacion_asiento(String asignacion_asiento) {
		this.asignacion_asiento = asignacion_asiento;
	}

	public int getduracion() {
		return duracion;
	}

	public void setduracion(int duracion) {
		this.duracion = duracion;
	}

	public String getescalas() {
		return escalas;
	}

	public void setescalas(String escalas) {
		this.escalas = escalas;
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
	public List<Viajes> getViaje() {
		return Viaje;
	}

	public void setViaje(List<Viajes> Viaje) {
		this.Viaje = Viaje;
	}
	//toString
	@Override
	public String toString() {
		return "Vuelos [id=" + Id_vuelo + ", aerolinea=" + aerolinea + ", TipoAsiento=" + TipoAsiento + ", maletas=" + maletas
				+ ", asignacion_asiento=" + asignacion_asiento + ", duracion=" + duracion + ", escalas=" + escalas + ", origen=" + origen
				+ ", destino=" + destino + "Viaje="+ Viaje + "]";
	}
}



