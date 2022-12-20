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

import com.crud.h2.dto.Reserva;
import com.crud.h2.service.ReservaServiceImpl;
import com.crud.h2.service.UsuarioServiceImpl;



@RestController
@RequestMapping("/api")
public class ReservaController {
	
	@Autowired
	ReservaServiceImpl reservaServiceImpl;
	
	@Autowired
	UsuarioServiceImpl usuarioServiceImpl;
	
	@GetMapping("/reservas")
	public List<Reserva> listarReservas(){
		return reservaServiceImpl.listarReservas();
	}
	
	@GetMapping("/reservas/usuario/{usuario}")
	public List<Reserva> listarReservasUsuario(@PathVariable(name="usuario") String usuario){
		return reservaServiceImpl.listarReservasUsuario(usuario);
	}
	
	
	
	
	@PostMapping("/reservas/post/usuario")
	public Reserva salvarReserva(@PathVariable(name="usuario") String usuario,@RequestBody Reserva reserva) {
		
		
		reserva.setId(usuarioServiceImpl.MostrarUsuarioPorUsuario(usuario).getId());
		return reservaServiceImpl.guardarReserva(reserva);
	}
	
	
	@GetMapping("/reservas/{id}")
	public Reserva ReservaXID(@PathVariable(name="ID_reserva") int id) {
		
		Reserva reserva_xid= new Reserva();
		
		reserva_xid= reservaServiceImpl.reservaXID(id);
		
		System.out.println("Reserva XID: "+reserva_xid);
		
		return reserva_xid;
	}
	
	@PutMapping("/reservas/{id}")
	public Reserva actualizarReserva(@PathVariable(name="ID_reserva")int id,@RequestBody Reserva reserva) {
		
		Reserva reserva_seleccionado= new Reserva();
		Reserva reserva_actualizado= new Reserva();
		
		reserva_seleccionado= reservaServiceImpl.reservaXID(id);
		
		reserva_seleccionado.setUsuario(reserva.getUsuario());
		reserva_seleccionado.setChollo(reserva.getChollo());
		reserva_seleccionado.setFechareserva(reserva.getFechareserva());
		
		reserva_actualizado = reservaServiceImpl.actualizarReserva(reserva_seleccionado);
		
		System.out.println("El Reserva actualizado es: "+ reserva_actualizado);
		
		return reserva_actualizado;
	}
	
	@DeleteMapping("/reservas/{id}")
	public void eleiminarReserva(@PathVariable(name="ID_reserva")int id) {
		reservaServiceImpl.eliminarReserva(id);
	}
	
	
}
