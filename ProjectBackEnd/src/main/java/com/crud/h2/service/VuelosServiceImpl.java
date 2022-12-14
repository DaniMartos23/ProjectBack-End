package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IVuelosDAO;
import com.crud.h2.dto.Vuelos;


@Service
public class VuelosServiceImpl implements IVuelosService{
	
	@Autowired
	IVuelosDAO IVuelosDAO;

	public List<Vuelos> listaVuelos() {
		return IVuelosDAO.findAll();
	}

	public Vuelos addVuelos(Vuelos Vuelos) {
		return IVuelosDAO.save(Vuelos);
	}

	public Vuelos getVuelosById(int id) {
		return IVuelosDAO.findById(id).get();
	}

	public Vuelos updateVuelos(Vuelos Vuelos) {
		return IVuelosDAO.save(Vuelos);
	}

	public void deleteVuelos(int id) {
		IVuelosDAO.deleteById(id);
	}


}
