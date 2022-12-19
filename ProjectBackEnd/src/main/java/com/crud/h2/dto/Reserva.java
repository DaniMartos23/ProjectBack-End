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

@Entity
@Table(name="reserva")
public class Reserva {
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int ID_reserva;
	
	@ManyToOne
	@JoinColumn(name = "ID_usuario")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name= "ID_chollo")
	private Chollo chollo;
	
	@Column(name="fecha_reserva")
	private Date fecha_reserva;
	
	//contructores
	public Reserva() {
		//super();
	}

	public Reserva(int id,Usuario user, Chollo chollo,Date fecha_reserv) {
		//super();
		this.ID_reserva = id;
		this.usuario = user;
		this.chollo = chollo;
		this.fecha_reserva=fecha_reserv;
		
		
	}

	//getters y setters
	
	public int getId() {
		return this.ID_reserva;
	}

	public void setId(int id) {
		this.ID_reserva = id;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Chollo getChollo() {
		return chollo;
	}

	public void setChollo(Chollo chollo) {
		this.chollo = chollo;
	}

	public Date getFechareserva() {
		return fecha_reserva;
	}

	public void setFechareserva(Date fecha_reserva) {
		this.fecha_reserva = fecha_reserva;
	}

	//toString
	@Override
	public String toString() {
		return "Reserva [ID_reserva=" + ID_reserva + ", usuario=" + usuario + ", fecha_reserva=" + fecha_reserva + "]";
	}
	
	
	
	
	
}
