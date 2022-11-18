package es.http.service.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import es.http.service.dto.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Integer>{
	
		public List<Usuario> findByNombre(String nombre);

}
