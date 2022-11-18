package com.crud.h2.dto;

import java.util.List;

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
@Table(name = "administradores")
public class administradores {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int ID_administradores;	
	
	@Column(name = "empresa")
	private String empresa;
	
	@ManyToOne
	@JoinColumn(name = "Id_chollo")
	private chollo chollo;
	
	@ManyToOne
	@JoinColumn(name = "Id_usuarios")
	private usuarios usuarios;
	

	
	public administradores() {
		
	}

	public administradores(int id, String empresa, usuarios usuarios, chollo chollo) {
		super();
		this.ID_administradores = id;
		this.empresa = empresa;
		this.usuarios  = usuarios;		
		this.chollo = chollo;
		
		
	}
	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}
	public int getempresa) {
		return empresa;
	}

	public void setempresa(int empresa) {
		this.empresa = empresa;
	}
	public usuarios getusuarios() {
		return usuarios;
	}

	public void setusuarios (usuarios usuariosl) {
		this.usuarios= usuarios;
	}
	public chollo getchollo() {
		return chollo;
	}

	public void setchollo (chollo chollo) {
		this.chollo= chollo;
	}

	
	
	
	//toString
	@Override
	public String toString() {
		return "administradores [id=" + ID_administradores +",usuarios="+ usuarios + "chollo="+ chollo + "empresa="+empresa+ "]";
	}
	
	
}
