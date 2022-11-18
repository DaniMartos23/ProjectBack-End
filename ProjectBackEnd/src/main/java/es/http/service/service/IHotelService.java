package es.http.service.service;

import java.util.List;

import es.http.service.dto.Hotel;

public interface IHotelService {

	public List<Hotel> listaHoteles();

	public Hotel addHotel(Hotel hotel);
	
	public Hotel updateHotel(Hotel hotel);
	
	public Hotel getHotelById(int id);

	public void deleteHotel(int id);
}
