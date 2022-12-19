package com.crud.h2.service;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.crud.h2.dao.IUsuarioDAO;
import com.crud.h2.dto.UserRoles;
import com.crud.h2.dto.Usuario;


@Service
public class UsuarioServiceImpl implements IUsuarioService,UserDetailsService {
	
	
		@Autowired
		IUsuarioDAO iUsuarioDAO;
		@Autowired
		UserRolesServiceImpl userrolesService;

		
		
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
		public Usuario MostrarUsuarioPorUsuario(String usuario) {
			// TODO Auto-generated method stub
			 return iUsuarioDAO.findByUsuario(usuario);
		}
		
		
		
		@Override
		public UserDetails loadUserByUsername(String user) throws UsernameNotFoundException {
			Usuario usuario =  iUsuarioDAO.findByUsuario(user);
			
			if (usuario == null) {
				throw new UsernameNotFoundException(user);
			}
			
			return new User(usuario.getUsuario(), usuario.getContraseña(), this.getAuthority(usuario));
			
		}
		
		private Collection<SimpleGrantedAuthority> getAuthority(Usuario usuario) {
			
			List<UserRoles> userroles=userrolesService.findbyname(usuario);
			Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
	        userroles.forEach(role -> {
	            authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getRoles().getName()));
	        });
	        return authorities;
	    }



}
