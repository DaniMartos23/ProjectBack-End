package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import es.http.service.dto.administradores;

public interface IAdministradoresDAO extends JpaRepository<administradores, Integer> {

}
