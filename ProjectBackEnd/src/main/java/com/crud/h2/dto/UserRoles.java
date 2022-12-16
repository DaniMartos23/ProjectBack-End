package com.crud.h2.dto;

import java.util.List;

import javax.persistence.CascadeType;
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
@Table(name = "userroles")

public class UserRoles {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int ID;	
	
	@ManyToOne
    @JoinColumn(name = "usuarios")
	private Usuario usuarios;
	
	
	@ManyToOne
    @JoinColumn(name = "id_roles")
	private Role id_roles;
	
	public UserRoles() {
	}
	
	public UserRoles(int ID, Usuario usuarios,Role role) {
		this.ID = ID;
		this.usuarios=usuarios;
		this.id_roles=role;
	}
	
	
	
	public int getID() {
		return ID;
	}



	public void setID(int iD) {
		ID = iD;
	}



	public Usuario getUsuario() {
		return usuarios;
	}

	public void setUsuario(Usuario usuarios) {
		this.usuarios = usuarios;
	}
	
	public Role getRoles() {
		return id_roles;
	}

	public void setRoles(Role roles) {
		this.id_roles = roles;
	}



	@Override
	public String toString() {
		return "UserRoles [ID=" + ID + ", usuarios=" + usuarios + ", id_role=" + id_roles + "]";
	}

	
}





