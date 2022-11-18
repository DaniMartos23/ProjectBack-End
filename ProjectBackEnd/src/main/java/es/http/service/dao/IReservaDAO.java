package es.http.service.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import es.http.service.dto.Reserva;

public interface IReservaDAO extends JpaRepository<Reserva, Integer>{
	

}
