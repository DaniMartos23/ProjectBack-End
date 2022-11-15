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
@Table(name="Hotel")
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long ID_Hotel;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "direccion")//no hace falta si se llama igual
	private String direccion;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "localidad")
	private String localidad;
	@Column(name = "estrellas")
	private int estrellas;
	@Column(name = "tipo_habitaciones")
	private String tipo_habitaciones;
	@Column(name = "mascotas")
	private byte mascotas;
	@Column(name = "tipo_pension")
	private String tipo_pension;   
	
	
	//contructores
	public Hotel() {
		super();
	}

	public Hotel(Long id, String nombre, String direccion, String descripcion, String localidad, int estrellas, String tipo_habitaciones,
			byte mascotas, String tipo_pension) {
		super();
		this.ID_Hotel = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.descripcion = descripcion;
		this.localidad = localidad;
		this.estrellas = estrellas;
		this.tipo_habitaciones = tipo_habitaciones;
		this.mascotas = mascotas;
		this.tipo_pension = tipo_pension;
		
	}

	//getters y setters
	
	public Long getId() {
		return ID_Hotel;
	}

	public void setId(Long id) {
		this.ID_Hotel = id;
	}

	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public String getdireccion() {
		return direccion;
	}

	public void setdireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getdescripcion() {
		return descripcion;
	}

	public void setdescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getlocalidad() {
		return localidad;
	}

	public void setlocalidad(String localidad) {
		this.localidad = localidad;
	}

	public int getestrellas() {
		return estrellas;
	}

	public void setestrellas(int estrellas) {
		this.estrellas = estrellas;
	}

	public String gettipo_habitaciones() {
		return tipo_habitaciones;
	}

	public void settipo_habitaciones(String tipo_habitaciones) {
		this.tipo_habitaciones = tipo_habitaciones;
	}
	
	public byte getmascotas() {
		return mascotas;
	}

	public void setmascotas(byte mascotas) {
		this.mascotas = mascotas;
	}

	public String gettipo_pension() {
		return tipo_pension;
	}

	public void settipo_pension(String tipo_pension) {
		this.tipo_pension = tipo_pension;
	}
	
	//toString
	@Override
	public String toString() {
		return "Hotel [id=" + ID_Hotel + ", nombre=" + nombre + ", direccion=" + direccion + ", descripcion=" + descripcion
				+ ", pais=" + localidad + ", estrellas=" + estrellas + ", notamedia=" + tipo_habitaciones + ", mascotas=" + mascotas
				+ ", tipo_pension=" + tipo_pension + "]";
	}



	

	
	
	

	

	
	
	
	
	
	
}
