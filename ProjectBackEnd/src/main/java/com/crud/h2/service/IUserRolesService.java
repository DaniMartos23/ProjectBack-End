package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.UserRoles;
import com.crud.h2.dto.Usuario;

public interface IUserRolesService {
	
	public UserRoles guardaUsuarioRol(UserRoles userrol);
	
	public List<UserRoles> listaUsuarioRols ();
	
	public List<UserRoles> findbyname(Usuario usuario);
}

