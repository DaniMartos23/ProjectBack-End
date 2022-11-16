package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Vuelos;

public interface IVuelosDAO extends JpaRepository<Vuelos, Integer> {

}
