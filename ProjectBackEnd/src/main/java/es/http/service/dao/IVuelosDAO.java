package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import es.http.service.dto.Vuelos;

public interface IVuelosDAO extends JpaRepository<Vuelos, Integer> {

}
