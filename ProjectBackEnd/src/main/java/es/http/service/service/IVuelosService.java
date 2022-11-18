package es.http.service.service;
import java.util.List;

import es.http.service.dto.Vuelos;


	public interface IVuelosService{
		
	public List<Vuelos> listaVuelos();

	public Vuelos addVuelos(Vuelos vuelo);
	
	public Vuelos updateVuelos(Vuelos vuelo);
	
	public Vuelos getVuelosById(int id);

	public void deleteVuelos(int id);

}
