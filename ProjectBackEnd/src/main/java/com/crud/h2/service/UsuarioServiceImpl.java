package com.crud.h2.service;

import static java.util.Collections.emptyList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IUsuarioDAO;
import com.crud.h2.dto.Usuario;


@Service
public class UsuarioServiceImpl implements IUsuarioService,UserDetailsService {
	
	
	
		@Autowired
		IUsuarioDAO iUsuarioDAO;
		@Override
		public List<Usuario> listarUsuarios() {
			
			return iUsuarioDAO.findAll();
		}
		@Override
		public Usuario guardarUsuario(Usuario usuario) {
			
			return iUsuarioDAO.save(usuario);
		}
		@Override
		public Usuario usuarioXID(int id) {
			
			return iUsuarioDAO.findById(id).get();
		}
		@Override
		public Usuario actualizarUsuario(Usuario usuario) {
			
			return iUsuarioDAO.save(usuario);
		}
		@Override
		public void eliminarUsuario(int id) {
			
			iUsuarioDAO.deleteById(id);
			
		}
		@Override
		public List<Usuario> listarUsuarioNombre(String nombre) {
			
			return iUsuarioDAO.findAllByNombre(nombre);
		}
		
		@Override
		public Usuario MostrarUsuarioPorNombre(String nombre) {
			// TODO Auto-generated method stub
			return iUsuarioDAO.findByNombre(nombre);
		}
		
		
		@Override
		public UserDetails loadUserByUsername(String user) throws UsernameNotFoundException {
			Usuario usuario =  iUsuarioDAO.findByNombre(user);
			
			if (usuario == null) {
				throw new UsernameNotFoundException(user);
			}
			return new User(usuario.getNombre(), usuario.getContraseña(), emptyList());
			
		}
		


}
