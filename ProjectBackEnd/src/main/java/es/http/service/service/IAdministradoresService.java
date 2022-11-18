package es.http.service.service;

import java.util.List;

import es.http.service.dto.administradores;

public interface IAdministradoresService {

	public List<administradores> listaAdministradores();

	public administradores addAdministradores(administradores Administradores);
	
	public administradores updateAdministradores(administradores Administradores);
	
	public administradores getAdministradoresById(int id);

	public void deleteAdministradores(int id);
}
