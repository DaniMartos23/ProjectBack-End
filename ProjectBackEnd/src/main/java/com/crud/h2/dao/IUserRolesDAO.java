package com.crud.h2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.UserRoles;
import com.crud.h2.dto.Usuario;

public interface IUserRolesDAO extends JpaRepository<UserRoles, Integer>{

	public List<UserRoles> findByUsuarios(Usuario usuario);

}
