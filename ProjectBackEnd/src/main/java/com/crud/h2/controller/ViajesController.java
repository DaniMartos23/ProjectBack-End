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

import com.crud.h2.dto.Viajes;
import com.crud.h2.service.ViajesServiceImpl;

@RestController
@RequestMapping("/api")
public class ViajesController {
	
	@Autowired
	ViajesServiceImpl ViajesService;
	
	@GetMapping("/Viajes")
	public List<Viajes> listaViajes(){
		return ViajesService.listaViajes();
	}
	
	@PostMapping("/Viajes/add")
	public Viajes addViajes(@RequestBody Viajes viaje) {
		return ViajesService.addViajes(viaje);
	}
	
	@GetMapping("/Viajes/{id}")
	public Viajes getViajesById(@PathVariable(name = "id") int id) {

		return ViajesService.getViajesById(id);
	}

	@PutMapping("/Viajes{id}")
	public Viajes updateViajes(@PathVariable(name = "id") int id, @RequestBody Viajes viaje) {
		System.out.println(viaje);
		Viajes viaje_seleccionado = new Viajes ();
		Viajes viaje_actualizado = new Viajes ();
		
		viaje_seleccionado = ViajesService.getViajesById(id);
		viaje_seleccionado.setorigen(viaje.getorigen());
		viaje_seleccionado.setdestino(viaje.getdestino());		
		viaje_actualizado = ViajesService.updateViajes(viaje_seleccionado);

		System.out.println("El viaje actualizado es: " + viaje_actualizado);

		return viaje_actualizado;
	}

	@DeleteMapping("/Viajes/{id}")
	public void deleteViajes(@PathVariable(name = "id") int id) {
		ViajesService.deleteViajes(id);
	}
}
