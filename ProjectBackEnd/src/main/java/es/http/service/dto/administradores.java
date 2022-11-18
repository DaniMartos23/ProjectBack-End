package es.http.service.dto;

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
	private Chollo chollo;
	
	@ManyToOne
	@JoinColumn(name = "Id_usuarios")
	private Usuario usuarios;
	

	
	public administradores() {
		
	}


	
	
	public administradores(int iD_administradores, String empresa, Chollo chollo, Usuario usuarios) {
		ID_administradores = iD_administradores;
		this.empresa = empresa;
		this.chollo = chollo;
		this.usuarios = usuarios;
	}




	public int getID_administradores() {
		return ID_administradores;
	}




	public void setID_administradores(int iD_administradores) {
		ID_administradores = iD_administradores;
	}




	public String getEmpresa() {
		return empresa;
	}




	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}




	public Chollo getChollo() {
		return chollo;
	}




	public void setChollo(Chollo chollo) {
		this.chollo = chollo;
	}




	public Usuario getUsuarios() {
		return usuarios;
	}




	public void setUsuarios(Usuario usuarios) {
		this.usuarios = usuarios;
	}




	//toString
	@Override
	public String toString() {
		return "administradores [id=" + ID_administradores +",usuarios="+ usuarios + "chollo="+ chollo + "empresa="+empresa+ "]";
	}
	
	
}
