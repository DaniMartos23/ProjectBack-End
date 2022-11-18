package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.administradores;

public interface IAdministradoresService {

	public List<administradores> listaAdministradores();

	public administradores addAdministradores(administradores Administradores);
	
	public administradores updateAdministradores(administradores Administradores);
	
	public administradores getAdministradoresById(int id);

	public void deleteAdministradores(int id);
}
