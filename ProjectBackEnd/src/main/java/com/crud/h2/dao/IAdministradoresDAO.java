package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Administradores;

public interface IAdministradoresDAO extends JpaRepository<Administradores, Integer> {

}
