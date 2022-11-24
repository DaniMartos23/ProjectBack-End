package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Administradores;

public interface IAdministradoresService {

	public List<Administradores> listaAdministradores();

	public Administradores addAdministradores(Administradores Administradores);
	
	public Administradores updateAdministradores(Administradores Administradores);
	
	public Administradores getAdministradoresById(int id);

	public void deleteAdministradores(int id);
}
