package com.crud.h2.service;
import java.util.List;

import com.crud.h2.dto.Vuelos;


	public interface IVuelosService{
		
	public List<Vuelos> listaVuelos();

	public Vuelos addVuelos(Vuelos vuelo);
	
	public Vuelos updateVuelos(Vuelos vuelo);
	
	public Vuelos getVuelosById(int id);

	public void deleteVuelos(int id);

}
