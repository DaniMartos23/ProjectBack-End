package es.http.service.service;

import java.util.List;

import es.http.service.dto.Usuario;



public interface IUsuarioService {

	//Metodos del CRUD
	public List<Usuario> listarUsuarios(); 
	
	public Usuario guardarUsuario(Usuario usuario);
	
	public Usuario usuarioXID(int id);
	
	public List<Usuario> listarUsuarioNombre(String nombre);
	
	public Usuario actualizarUsuario(Usuario usuario); 
	
	public void eliminarUsuario(int id);
	
	
}
