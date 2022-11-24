package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Administradores;
import com.crud.h2.service.AdministradoresServiceImpl;

@RestController

@RequestMapping("/api")
public class AdministradoresController {
	@Autowired
	AdministradoresServiceImpl AdministradoresService;

	@GetMapping("/administradores")
	public List<Administradores> listaAdministradores() {
		return AdministradoresService.listaAdministradores();
	}

	@PostMapping("administradores")
	public Administradores addAdministradores(@RequestBody Administradores Administradores) {

		return AdministradoresService.addAdministradores(Administradores);
	}

	@GetMapping("/administradores/{id}")
	public Administradores getAdministradoresById(@PathVariable(name = "id") int id) {

		return AdministradoresService.getAdministradoresById(id);
	}

	@PutMapping("/Administradores/{id}")
	public Administradores updateAdministradores(@PathVariable(name = "id") int id, @RequestBody Administradores Administradores) {
		System.out.println(Administradores);
		Administradores Administradores_seleccionado = new Administradores();
		Administradores Administradores_actualizado = new Administradores();
		
		Administradores_seleccionado = AdministradoresService.getAdministradoresById(id);
		Administradores_seleccionado.setNombre(Administradores.getNombre());
		Administradores_seleccionado.setApellido(Administradores.getApellidos());
		Administradores_seleccionado.setFechaNacimiento(Administradores.getFechaNacimiento());
		Administradores_seleccionado.setCorreo(Administradores.getCorreo());
		Administradores_seleccionado.setCiudad(Administradores.getCiudad());
		Administradores_seleccionado.setFotoPerfil(Administradores.getFotoPerfil());
		Administradores_seleccionado.setReservas(Administradores.getReservas());
		Administradores_seleccionado.setEmpresa(Administradores.getEmpresa());
		Administradores_seleccionado.setChollo(Administradores.getChollo());
		

		Administradores_actualizado = AdministradoresService.updateAdministradores(Administradores_seleccionado);

		System.out.println("El Administrador actualizado es: " + Administradores_actualizado);

		return Administradores_actualizado;
	}

	@DeleteMapping("/administradores/{id}")
	public void deleteAdministradores(@PathVariable(name = "id") int id) {
		AdministradoresService.deleteAdministradores(id);
	}
}
