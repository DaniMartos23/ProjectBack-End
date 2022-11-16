package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Viajes;

public interface IViajesDAO extends JpaRepository<Viajes, Integer> {

}
