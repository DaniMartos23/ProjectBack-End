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

	@Override
	public List<administradores> listaAdministradores() {
		// TODO Auto-generated method stub
		return IAdministradoresDAO.findAll();
	}

	@Override
	public administradores addAdministradores(administradores Administradores) {
		// TODO Auto-generated method stub
		return IAdministradoresDAO.save(Administradores);
	}

	@Override
	public administradores updateAdministradores(administradores Administradores) {
		// TODO Auto-generated method stub
		return IAdministradoresDAO.save(Administradores);
	}

	@Override
	public administradores getAdministradoresById(int id) {
		// TODO Auto-generated method stub
		return IAdministradoresDAO.findById(id).get();
	}

	@Override
	public void deleteAdministradores(int id) {
		// TODO Auto-generated method stub
		IAdministradoresDAO.deleteById(id);
	}

	


}
