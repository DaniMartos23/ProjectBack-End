package com.crud.h2.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IViajesDAO;
import com.crud.h2.dto.Viajes;


@Service
public class ViajesServiceImpl implements IViajesService{
	
	@Autowired
	IViajesDAO IViajesDAO;

	public List<Viajes> listaViajes() {
		return IViajesDAO.findAll();
	}

	public Viajes addViajes(Viajes Viajes) {
		return IViajesDAO.save(Viajes);
	}

	public Viajes getViajesById(int id) {
		return IViajesDAO.findById(id).get();
	}

	public Viajes updateViajes(Viajes Viajes) {
		return IViajesDAO.save(Viajes);
	}

	public void deleteViajes(int id) {
		IViajesDAO.deleteById(id);
	}


}