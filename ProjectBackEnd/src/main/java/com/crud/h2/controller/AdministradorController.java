package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Administrador;
import com.crud.h2.service.AdministradorServiceImpl;



@RestController
@RequestMapping("/api")
public class AdministradorController {
	
	@Autowired
	AdministradorServiceImpl administradorServiceImpl;
	
	@GetMapping("/administradors")
	public List<Administrador> listarAdministradors(){
		return administradorServiceImpl.listarAdministradors();
	}
	
	//listar administradors por campo nombre
	@GetMapping("/administradors/nombre/{nombre}")
	public List<Administrador> listarAdministradorNombre(@PathVariable(name="nombre") String nombre) {
	    return administradorServiceImpl.listarAdministradorNombre(nombre);
	}
	
	
	@PostMapping("/administradors")
	public Administrador salvarAdministrador( Administrador administrador) {
		return administradorServiceImpl.guardarAdministrador(administrador);
	}
	
	
	@GetMapping("/administradors/{id}")
	public Administrador AdministradorXID(@PathVariable(name="ID_administrador") int id) {
		
		Administrador administrador_xid= new Administrador();
		
		administrador_xid= administradorServiceImpl.administradorXID(id);
		
		System.out.println("Administrador XID: "+administrador_xid);
		
		return administrador_xid;
	}
	
	@PutMapping("/administradors/{id}")
	public Administrador actualizarAdministrador(@PathVariable(name="ID_administrador")int id, Administrador administrador) {
		
		Administrador administrador_seleccionado= new Administrador();
		Administrador administrador_actualizado= new Administrador();
		
		administrador_seleccionado= administradorServiceImpl.administradorXID(id);
		
		administrador_seleccionado.setNombre(administrador.getNombre());
		administrador_seleccionado.setApellido(administrador.getApellidos());
		administrador_seleccionado.setFechaNacimiento(administrador.getFechaNacimiento());
		administrador_seleccionado.setCorreo(administrador.getCorreo());
		administrador_seleccionado.setCiudad(administrador.getCiudad());
		administrador_seleccionado.setFotoPerfil(administrador.getFotoPerfil());
		administrador_seleccionado.setEmpresa(administrador.getEmpresa());
		
		administrador_actualizado = administradorServiceImpl.actualizarAdministrador(administrador_seleccionado);
		
		System.out.println("El Administrador actualizado es: "+ administrador_actualizado);
		
		return administrador_actualizado;
	}
	
	@DeleteMapping("/administradors/{id}")
	public void eleiminarAdministrador(@PathVariable(name="ID_administrador")int id) {
		administradorServiceImpl.eliminarAdministrador(id);
	}
	
	
}
