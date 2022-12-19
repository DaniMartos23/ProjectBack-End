package com.crud.h2.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Reserva;


public interface IReservaDAO extends JpaRepository<Reserva, Integer>{
	
	public List<Reserva> findAllByUsuario(String usuario);

}
