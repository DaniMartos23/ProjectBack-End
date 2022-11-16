package com.crud.h2.service;
import java.util.List;

import com.crud.h2.dto.Vuelos;

public class IVuelosService {
	public List<Vuelos> listaVuelos();

	public Vuelos addVuelos(Vuelos vuelo);
	
	public Vuelos updateVuelos(Vuelos vuelo);
	
	public Vuelos getVuelosById(Long id);

	public void deleteVuelos(Long id);

}
