package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Usuario;



public interface IUsuarioService {

	//Metodos del CRUD
	public List<Usuario> listarUsuarios(); 
	
	public Usuario guardarUsuario(Usuario usuario);
	
	public Usuario usuarioXID(Long id);
	
	public List<Usuario> listarUsuarioNombre(String nombre);
	
	public Usuario actualizarUsuario(Usuario usuario); 
	
	public void eliminarUsuario(Long id);
	
	
}
