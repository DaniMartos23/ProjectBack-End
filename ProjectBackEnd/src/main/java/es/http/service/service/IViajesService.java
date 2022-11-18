package es.http.service.service;

import java.util.List;

import es.http.service.dto.Viajes;

	public interface IViajesService {

		public List<Viajes> listaViajes();

		public Viajes addViajes(Viajes viaje);
		
		public Viajes updateViajes(Viajes vieje);
		
		public Viajes getViajesById(int id);

		public void deleteViajes(int id);
	}
