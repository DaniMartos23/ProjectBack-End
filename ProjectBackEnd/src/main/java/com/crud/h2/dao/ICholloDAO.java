package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Chollo;


public interface ICholloDAO extends JpaRepository<Chollo, Integer> {
	

}
