package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import es.http.service.dto.Hotel;

public interface IHotelDAO extends JpaRepository<Hotel, Integer> {

}
