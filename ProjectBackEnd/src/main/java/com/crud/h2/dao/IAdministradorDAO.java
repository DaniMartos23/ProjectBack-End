package com.crud.h2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Administrador;

public interface IAdministradorDAO extends JpaRepository<Administrador, Integer>{
	
		public List<Administrador> findByNombre(String nombre);

}
