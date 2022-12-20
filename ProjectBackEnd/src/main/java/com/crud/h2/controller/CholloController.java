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

import com.crud.h2.dto.Chollo;
import com.crud.h2.service.CholloSeviceImpl;


@RestController
@RequestMapping("/api")
public class CholloController {
	
	@Autowired
	CholloSeviceImpl cholloService;

	@GetMapping("/chollos")
	public List<Chollo> listaChollo() {
		return cholloService.listaChollo();
	}

	@PostMapping("/chollos")
	public Chollo addChollo(@RequestBody Chollo chollo) {

		return cholloService.addChollo(chollo);
	}

	@GetMapping("/chollos/{id}")
	public Chollo getCholloById(@PathVariable(name = "id") int id) {

		return cholloService.getCholloById(id);
	}

	@PutMapping("/chollos/{id}")
	public Chollo updateChollo(@PathVariable(name = "id") int id, @RequestBody Chollo chollo) {
		System.out.println(chollo);
		Chollo chollo_seleccionado = new Chollo();
		Chollo chollo_actualizado = new Chollo();
		
		chollo_seleccionado = cholloService.getCholloById(id);
		
		chollo_seleccionado.setDescripcion(chollo.getDescripcion());
		chollo_seleccionado.setFecha(chollo.getFecha());
	
		chollo_seleccionado.setPrecio(chollo.getPrecio());
		chollo_seleccionado.setTitulo(chollo.getTitulo());
		chollo_seleccionado.setUnidades(chollo.getUnidades());
		chollo_seleccionado.setValoracion(chollo.getValoracion());
		chollo_seleccionado.setViajes(chollo.getViajes());
		chollo_seleccionado.setImage_url(chollo.getImage_url());
		
		chollo_seleccionado.setUsuario(chollo.getUsuario());

		chollo_actualizado = cholloService.updateChollo(chollo_seleccionado);

		System.out.println("chollo actualizado: " + chollo_actualizado);

		return chollo_actualizado;
	}

	@DeleteMapping("/chollos/{id}")
	public void deleteChollo(@PathVariable(name = "id") int id) {
		cholloService.deleteChollo(id);
	}
	
	
}
