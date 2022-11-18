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

import es.http.service.dto.Usuario;
import es.http.service.service.UsuarioServiceImpl;



@RestController
@RequestMapping("/api")
public class UsuarioController {
	
	@Autowired
	UsuarioServiceImpl usuarioServiceImpl;
	
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
	public Usuario salvarUsuario( Usuario usuario) {
		return usuarioServiceImpl.guardarUsuario(usuario);
	}
	
	
	@GetMapping("/usuarios/{id}")
	public Usuario UsuarioXID(@PathVariable(name="ID_usuario") int id) {
		
		Usuario usuario_xid= new Usuario();
		
		usuario_xid= usuarioServiceImpl.usuarioXID(id);
		
		System.out.println("Usuario XID: "+usuario_xid);
		
		return usuario_xid;
	}
	
	@PutMapping("/usuarios/{id}")
	public Usuario actualizarUsuario(@PathVariable(name="ID_usuario")int id, Usuario usuario) {
		
		Usuario usuario_seleccionado= new Usuario();
		Usuario usuario_actualizado= new Usuario();
		
		usuario_seleccionado= usuarioServiceImpl.usuarioXID(id);
		
		usuario_seleccionado.setNombre(usuario.getNombre());
		usuario_seleccionado.setApellido(usuario.getApellidos());
		usuario_seleccionado.setFechaNacimiento(usuario.getFechaNacimiento());
		usuario_seleccionado.setCorreo(usuario.getCorreo());
		usuario_seleccionado.setCiudad(usuario.getCiudad());
		usuario_seleccionado.setFotoPerfil(usuario.getFotoPerfil());
		
		usuario_actualizado = usuarioServiceImpl.actualizarUsuario(usuario_seleccionado);
		
		System.out.println("El Usuario actualizado es: "+ usuario_actualizado);
		
		return usuario_actualizado;
	}
	
	@DeleteMapping("/usuarios/{id}")
	public void eleiminarUsuario(@PathVariable(name="ID_usuario")int id) {
		usuarioServiceImpl.eliminarUsuario(id);
	}
	
	
}
