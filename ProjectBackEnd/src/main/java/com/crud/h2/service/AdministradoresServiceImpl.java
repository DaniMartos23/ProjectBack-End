package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IAdministradoresDAO;
import com.crud.h2.dto.Administradores;


@Service
public class AdministradoresServiceImpl implements IAdministradoresService{
	
	@Autowired
	IAdministradoresDAO IAdministradoresDAO;

	@Override
	public List<Administradores> listaAdministradores() {
		// TODO Auto-generated method stub
		return IAdministradoresDAO.findAll();
	}

	@Override
	public Administradores addAdministradores(Administradores Administradores) {
		// TODO Auto-generated method stub
		return IAdministradoresDAO.save(Administradores);
	}

	@Override
	public Administradores updateAdministradores(Administradores Administradores) {
		// TODO Auto-generated method stub
		return IAdministradoresDAO.save(Administradores);
	}

	@Override
	public Administradores getAdministradoresById(int id) {
		// TODO Auto-generated method stub
		return IAdministradoresDAO.findById(id).get();
	}

	@Override
	public void deleteAdministradores(int id) {
		// TODO Auto-generated method stub
		IAdministradoresDAO.deleteById(id);
	}

	


}
