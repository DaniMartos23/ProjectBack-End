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
@Table(name="Vuelos")
public class Vuelos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long Id_vuelos;
	@Column(name = "aerolinea")//no hace falta si se llama igual
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
	
	
	//contructores
	public Vuelos() {
		super();
	}

	public Vuelos(Long id, String aerolinea, String TipoAsiento, String maletas, String asignacion_asiento, int duracion, String escalas,
			String origen, String destino) {
		super();
		this.Id_vuelos = id;
		this.aerolinea = aerolinea;
		this.TipoAsiento = TipoAsiento;
		this.maletas = maletas;
		this.asignacion_asiento = asignacion_asiento;
		this.duracion = duracion;
		this.escalas = escalas;
		this.origen = origen;
		this.destino = destino;
		
	}

	//getters y setters
	
	public Long getId() {
		return Id_vuelos ;
	}

	public void setId(Long id) {
		this.Id_vuelos  = id;
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
	
	//toString
	@Override
	public String toString() {
		return "Hotel [id=" + Id_vuelos + ", aerolinea=" + aerolinea + ", TipoAsiento=" + TipoAsiento + ", maletas=" + maletas
				+ ", asignacion_asiento=" + asignacion_asiento + ", duracion=" + duracion + ", escalas=" + escalas + ", origen=" + origen
				+ ", destino=" + destino + "]";
	}
}



