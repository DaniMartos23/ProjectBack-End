package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import es.http.service.dto.Viajes;

public interface IViajesDAO extends JpaRepository<Viajes, Integer> {

}
