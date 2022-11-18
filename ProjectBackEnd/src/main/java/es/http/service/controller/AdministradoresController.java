package es.http.service.controller;

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

import es.http.service.dto.administradores;
import es.http.service.service.AdministradoresServiceImpl;

@RestController

@RequestMapping("/api")
public class AdministradoresController {
	@Autowired
	AdministradoresServiceImpl AdministradoresService;

	@GetMapping("/administradores")
	public List<administradores> listaAdministradores() {
		return AdministradoresService.listaAdministradores();
	}

	@PostMapping("administradores")
	public administradores addAdministradores(@RequestBody administradores Administradores) {

		return AdministradoresService.addAdministradores(Administradores);
	}

	@GetMapping("/administradores/{id}")
	public administradores getAdministradoresById(@PathVariable(name = "id") int id) {

		return AdministradoresService.getAdministradoresById(id);
	}

	@PutMapping("/Administradores/{id}")
	public administradores updateAdministradores(@PathVariable(name = "id") int id, @RequestBody administradores Administradores) {
		System.out.println(Administradores);
		administradores Administradores_seleccionado = new administradores();
		administradores Administradores_actualizado = new administradores();
		
		Administradores_seleccionado = AdministradoresService.getAdministradoresById(id);
		Administradores_seleccionado.setUsuarios(Administradores.getUsuarios());
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
