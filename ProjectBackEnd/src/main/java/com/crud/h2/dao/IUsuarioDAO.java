package com.crud.h2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Integer>{
	
		public List<Usuario> findByNombre(String nombre);

}
