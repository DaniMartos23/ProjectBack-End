package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Administrador;



public interface IAdministradorService {

	//Metodos del CRUD
	public List<Administrador> listarAdministradors(); 
	
	public Administrador guardarAdministrador(Administrador administrador);
	
	public Administrador administradorXID(int id);
	
	public List<Administrador> listarAdministradorNombre(String nombre);
	
	public Administrador actualizarAdministrador(Administrador administrador); 
	
	public void eliminarAdministrador(int id);
	
	
}
