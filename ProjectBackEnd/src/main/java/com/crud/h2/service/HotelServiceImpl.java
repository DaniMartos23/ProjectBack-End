package com.crud.h2.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dto.Hotel;
import com.crud.h2.dao.IHotelDAO;


@Service
public class HotelServiceImpl implements IHotelService{
	
	@Autowired
	IHotelDAO IHotelDAO;

	public List<Hotel> listaHoteles() {
		return IHotelDAO.findAll();
	}

	public Hotel addHotel(Hotel hotel) {
		return IHotelDAO.save(hotel);
	}

	public Hotel getHotelById(int id) {
		return IHotelDAO.findById(id).get();
	}

	public Hotel updateHotel(Hotel Hotel) {
		return IHotelDAO.save(Hotel);
	}

	public void deleteHotel(int id) {
		IHotelDAO.deleteById(id);
	}


}
