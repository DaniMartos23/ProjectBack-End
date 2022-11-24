package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dao.IUsuarioDAO;
import com.crud.h2.dto.Usuario;
import com.crud.h2.service.UsuarioServiceImpl;







@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class UsuarioController {
	
	@Autowired
	UsuarioServiceImpl usuarioServiceImpl;
	
	private IUsuarioDAO iUsuarioDAO;
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public UsuarioController(IUsuarioDAO iUsuarioDAO, BCryptPasswordEncoder bCryptPasswordEncoder) {
		this.iUsuarioDAO = iUsuarioDAO;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}
	
	
	@GetMapping("/response-entity-builder-with-http-headers")
	public ResponseEntity<String> usingResponseEntityBuilderAndHttpHeaders() {
	    HttpHeaders responseHeaders = new HttpHeaders();
	    responseHeaders.set("Baeldung-Example-Header", 
	      "Value-ResponseEntityBuilderWithHttpHeaders");

	    return ResponseEntity.ok()
	      .headers(responseHeaders)
	      .body("Response with header using ResponseEntity");
	}
	
	@GetMapping("/usuarios")
	public List<Usuario> listarUsuarios(){
		return usuarioServiceImpl.listarUsuarios();
	}
	
	//listar usuarios por campo nombre
	@GetMapping("/usuarios/nombre/{nombre}")
	public List<Usuario> listarUsuarioNombre(@PathVariable(name="nombre") String nombre) {
	    return usuarioServiceImpl.listarUsuarioNombre(nombre);
	}
	
	
	@PostMapping("/usuarios")
	public Usuario salvarUsuario( @RequestBody Usuario usuario) {
		return usuarioServiceImpl.guardarUsuario(usuario);
	}
	
	
	@GetMapping("/usuarios/{ID_usuario}")
	public Usuario UsuarioXID(@PathVariable(name="ID_usuario") int id) {
		
		Usuario usuario_xid= new Usuario();
		
		usuario_xid= usuarioServiceImpl.usuarioXID(id);
		
		System.out.println("Usuario XID: "+usuario_xid);
		
		return usuario_xid;
	}
	
	@PutMapping("/usuarios/{ID_usuario}")
	public Usuario actualizarUsuario(@PathVariable(name="ID_usuario")int id,@RequestBody Usuario usuario) {
		
		Usuario usuario_seleccionado= new Usuario();
		Usuario usuario_actualizado= new Usuario();
		
		usuario_seleccionado= usuarioServiceImpl.usuarioXID(id);
		
		usuario_seleccionado.setNombre(usuario.getNombre());
		usuario_seleccionado.setApellido(usuario.getApellidos());
		usuario_seleccionado.setFechaNacimiento(usuario.getFechaNacimiento());
		usuario_seleccionado.setCorreo(usuario.getCorreo());
		usuario_seleccionado.setCiudad(usuario.getCiudad());
		usuario_seleccionado.setFotoPerfil(usuario.getFotoPerfil());
		usuario_seleccionado.setReservas(usuario.getReservas());
		
		usuario_actualizado = usuarioServiceImpl.actualizarUsuario(usuario_seleccionado);
		
		System.out.println("El Usuario actualizado es: "+ usuario_actualizado);
		
		return usuario_actualizado;
	}
	
	@DeleteMapping("/usuarios/{ID_usuario}")
	public void eleiminarUsuario(@PathVariable(name="ID_usuario")int id) {
		usuarioServiceImpl.eliminarUsuario(id);
	}
	
	
}
