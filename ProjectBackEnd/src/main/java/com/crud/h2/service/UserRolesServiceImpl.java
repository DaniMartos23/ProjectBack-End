package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IUserRolesDAO;
import com.crud.h2.dto.UserRoles;
import com.crud.h2.dto.Usuario;


@Service
public class UserRolesServiceImpl implements IUserRolesService {

	@Autowired
	IUserRolesDAO iUserRolDAO;
	
	public UserRoles guardaUsuarioRol(UserRoles userrol) {
		return iUserRolDAO.save(userrol);
	}
	
	public List<UserRoles> listaUsuarioRols (){
		return iUserRolDAO.findAll();
	}
	
	public List<UserRoles> findbyname(Usuario usuario){
		return iUserRolDAO.findByUsuarios(usuario);
	}
}
