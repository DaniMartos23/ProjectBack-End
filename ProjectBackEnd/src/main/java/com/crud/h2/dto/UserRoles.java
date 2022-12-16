package com.crud.h2.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "Userroles")

public class UserRoles {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int ID;	
	
	@OneToMany(mappedBy= "Userroles", cascade=CascadeType.ALL,  orphanRemoval = true)
	private List<Usuario> usuarios;
	
	@OneToMany(mappedBy= "Userroles", cascade=CascadeType.ALL,  orphanRemoval = true)
	private List<Role> roles;
	
	
	public UserRoles(int ID) {
		this.ID = ID;
	}
	
	
	
	public int getID() {
		return ID;
	}



	public void setID(int iD) {
		ID = iD;
	}



	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY)
	public List<Usuario> getUsuario() {
		return usuarios;
	}

	public void setUsuario(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY)
	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	
}





