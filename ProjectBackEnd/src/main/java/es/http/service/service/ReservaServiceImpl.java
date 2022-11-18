package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IReservaDAO;
import es.http.service.dto.Reserva;

@Service
public class ReservaServiceImpl implements IReservaService{
	
	
	
		@Autowired
		IReservaDAO iReservaDAO;
		@Override
		public List<Reserva> listarReservas() {
			
			return iReservaDAO.findAll();
		}
		@Override
		public Reserva guardarReserva(Reserva reserva) {
			
			return iReservaDAO.save(reserva);
		}
		@Override
		public Reserva reservaXID(int id) {
			
			return iReservaDAO.findById(id).get();
		}
		@Override
		public Reserva actualizarReserva(Reserva reserva) {
			
			return iReservaDAO.save(reserva);
		}
		@Override
		public void eliminarReserva(int id) {
			
			iReservaDAO.deleteById(id);
			
		}
		


}
