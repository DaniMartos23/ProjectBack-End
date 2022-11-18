package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dto.administradores;
import com.crud.h2.dao.IAdministradoresDAO;


@Service
public class AdministradoresServiceImpl implements IAdministradoresService{
	
	@Autowired
	IAdministradoresDAO IAdministradoresDAO;

	public List<administradores> listaAdministradores() {
		return IAdministradoresDAO.findAll();
	}

	public administradores addHotel(administradores Administradores) {
		return IAdministradoresDAO.save(Administradores);
	}

	public administradores getHotelById(int id) {
		return IAdministradoresDAO.findById(id).get();
	}

	public administradores updateHotel(administradores Administradores) {
		return IAdministradoresDAO.save(Administradores);
	}

	public void deleteAdministradores(int id) {
		IAdministradoresDAO.deleteById(id);
	}


}
