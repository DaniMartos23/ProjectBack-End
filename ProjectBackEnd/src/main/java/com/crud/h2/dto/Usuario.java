package com.crud.h2.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "trabajo")
	private String trabajo;
	@Column(name="salario")
	private double salario;
	
	private enum trabajos{
		Programador,Desarrollador,Tester,Trabajador
	}
	
	public Usuario() {
		
	}
	/**
	 * @param id
	 * @param nombre
	 * @param trabajo
	 * @param salario
	 */
	public Usuario(Long id, String nombre, String trabajo) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.trabajo=compruebaTrabajo(trabajo);
		this.salario=compruebaSalario(this.trabajo);
	}
	private double compruebaSalario(String trabajo2) {
		// método que pasa un trabajo y devuelve un salario
		double aux_salario;
		switch(trabajo2) {
			case "Programador":
				aux_salario=2000;
				break;
			case "Desarrollador":
				aux_salario=1800.50;
				break;
			case "Tester":
				aux_salario=1600;
				break;
			default:
				aux_salario=1200;
				break;
		}
		
		return aux_salario;
	}
	private String compruebaTrabajo(String trabajo2) {
		// metodo que comprueba si el trabajo se incluye en el enum si no devuelve coomo trabajador
		for (trabajos t : trabajos.values()) { 
			if (t.name().equals(trabajo2)) return trabajo2;
			}

		
		return (""+trabajos.Trabajador);
	}
	//Getters y Setters
	
	/**
	* @return id
	*/
	public Long getId() {
		return this.id;
	}

	/**
	* @param id
	*/
	public void setId(Long id) {
		this.id = id;
	}

	/**
	* @return nombre
	*/
	public String getNombre() {
		return this.nombre;
	}

	/**
	* @param nombre
	*/
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	* @return trabajo
	*/
	public String getTrabajo() {
		return this.trabajo;
	}

	/**
	* @param trabajo
	*/
	public void setTrabajo(String trabajo) {
		this.trabajo = compruebaTrabajo(trabajo);
		this.salario=compruebaSalario(this.trabajo);
	}

	/**
	* @return salario
	*/
	public Double getSalario() {
		return this.salario;
	}

	/**
	* @param salario
	*/
	public void setSalario(Double salario) {
		this.salario = salario;
	}
		
	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Cliente [id=" + this.id + ", nombre=" + this.nombre + ", trabajo=" + this.trabajo + ", salario=" + this.salario
				+ "]";
	}
}
