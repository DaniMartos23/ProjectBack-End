package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Hotel;

public interface IHotelDAO extends JpaRepository<Hotel, Long> {

}
