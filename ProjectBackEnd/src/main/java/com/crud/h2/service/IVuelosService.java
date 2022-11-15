package com.crud.h2.service;
import java.util.List;

import com.crud.h2.dto.Vuelos;

public class IVuelosService {
	public List<Vuelos> listaVuelos();

	public Vuelos addVuelos(Vuelos vuelos);
	
	public Vuelos updateVuelos(Vuelos vuelos);
	
	public Vuelos getVuelosById(Long id);

	public void deleteVuelos(Long id);

}
