package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IAdministradorDAO;
import com.crud.h2.dto.Administrador;


@Service
public class AdministradorServiceImpl implements IAdministradorService{
	
	
	
		@Autowired
		IAdministradorDAO iAdministradorDAO;
		@Override
		public List<Administrador> listarAdministradors() {
			
			return iAdministradorDAO.findAll();
		}
		@Override
		public Administrador guardarAdministrador(Administrador administrador) {
			
			return iAdministradorDAO.save(administrador);
		}
		@Override
		public Administrador administradorXID(int id) {
			
			return iAdministradorDAO.findById(id).get();
		}
		@Override
		public Administrador actualizarAdministrador(Administrador administrador) {
			
			return iAdministradorDAO.save(administrador);
		}
		@Override
		public void eliminarAdministrador(int id) {
			
			iAdministradorDAO.deleteById(id);
			
		}
		@Override
		public List<Administrador> listarAdministradorNombre(String nombre) {
			
			return iAdministradorDAO.findByNombre(nombre);
		}
		


}
