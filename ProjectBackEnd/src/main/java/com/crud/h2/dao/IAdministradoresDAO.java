package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.administradores;

public interface IAdministradoresDAO extends JpaRepository<administradores, Integer> {

}
