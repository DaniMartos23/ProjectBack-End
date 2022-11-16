package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Viajes;

	public interface IViajesService {

		public List<Viajes> listaViajes();

		public Viajes addViajes(Viajes viaje);
		
		public Viajes updateViajes(Viajes vieje);
		
		public Viajes getViajesById(int id);

		public void deleteViajes(int id);
	}
