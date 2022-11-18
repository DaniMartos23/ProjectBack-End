package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import es.http.service.dto.Chollo;


public interface ICholloDAO extends JpaRepository<Chollo, Integer> {
	

}
