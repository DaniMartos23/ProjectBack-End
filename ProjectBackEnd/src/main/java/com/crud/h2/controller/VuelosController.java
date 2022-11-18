package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Vuelos;
import com.crud.h2.service.VuelosServiceImpl;

@RestController

@RequestMapping("/api")
public class VuelosController {
	@Autowired
	VuelosServiceImpl VuelosService;

	@GetMapping("/vuelos")
	public List<Vuelos> listaVuelos() {
		return VuelosService.listaVuelos();
	}

	@PostMapping("/vuelos")
	public Vuelos addVuelos(@RequestBody Vuelos Vuelos) {

		return VuelosService.addVuelos(Vuelos);
	}

	@GetMapping("/vuelos/{id}")
	public Vuelos getVuelosById(@PathVariable(name = "id") int id) {

		return VuelosService.getVuelosById(id);
	}

	@PutMapping("/vuelos/{id}")
	public Vuelos updateVuelos(@PathVariable(name = "id") int id, @RequestBody Vuelos Vuelos) {
		System.out.println(Vuelos);
		Vuelos Vuelo_seleccionado = new Vuelos();
		Vuelos Vuelo_actualizado = new Vuelos();
		
		Vuelo_seleccionado = VuelosService.getVuelosById(id);
		Vuelo_seleccionado.setaerolinea(Vuelos.getaerolinea());
		Vuelo_seleccionado.setTipoAsiento(Vuelos.getTipoAsiento());
		Vuelo_seleccionado.setmaletas(Vuelos.getmaletas());
		Vuelo_seleccionado.setasignacion_asiento(Vuelos.getasignacion_asiento());
		Vuelo_seleccionado.setduracion(Vuelos.getduracion());
		Vuelo_seleccionado.setescalas(Vuelos.getescalas());
		Vuelo_seleccionado.setorigen(Vuelos.getorigen());
		Vuelo_seleccionado.setdestino(Vuelos.getdestino());
		Vuelo_actualizado = VuelosService.updateVuelos(Vuelo_seleccionado);

		System.out.println("El Vuelo actualizado es: " + Vuelo_actualizado);

		return Vuelo_actualizado;
	}

	@DeleteMapping("/vuelos/{id}")
	public void deleteVuelos(@PathVariable(name = "id") int id) {
		VuelosService.deleteVuelos(id);
	}
}