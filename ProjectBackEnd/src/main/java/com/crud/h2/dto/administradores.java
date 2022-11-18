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
public class administradores extends Usuario{
	
	

	@Id
	@JoinColumn(name = "ID_usuario")
	private Usuario usuarios;
	
	@Column(name = "empresa")
	private String empresa;
	
	@OneToMany
	@JoinColumn(name = "ID_chollo")
	private List<Chollo> chollos;
	
	

	
	public administradores() {
		
	}


	
	
	public administradores(Usuario usuarios, String empresa, List<Chollo> chollo ) {
		super(usuarios.getId(),usuarios.getNombre(),usuarios.getApellidos(),usuarios.getFechaNacimiento(),usuarios.getCorreo(),usuarios.getCiudad(),usuarios.getFotoPerfil());
		this.empresa = empresa;
		this.chollos = chollo;
		this.usuarios = usuarios;
	}




	

	public String getEmpresa() {
		return empresa;
	}




	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "chollo")
	public List<Chollo> getChollo() {
		return chollos;
	}




	public void setChollo(List<Chollo> chollo) {
		this.chollos = chollo;
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
		return "administradores [usuarios=" + usuarios.toString() +",usuarios="+ usuarios + "chollo="+ chollos + "empresa="+empresa+ "]";
	}
	
	
}
