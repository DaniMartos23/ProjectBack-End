package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Reserva;



public interface IReservaService {

	//Metodos del CRUD
	public List<Reserva> listarReservas(); 
	
	public Reserva guardarReserva(Reserva reserva);
	
	public Reserva reservaXID(int id);
	
	public Reserva actualizarReserva(Reserva reserva); 
	
	public void eliminarReserva(int id);
	
	public List<Reserva> listarReservasUsuario (String usuario);
	
	
}
