/*
 * Copyright 2021 INSTITUTO ECUATORIANO DE SEGURIDAD SOCIAL - ECUADOR 
 * Todos los derechos reservados
 */ 
package com.cursojava.curso.controller;

import javax.websocket.server.PathParam;

import com.cursojava.curso.dao.UsuarioDao;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cursojava.curso.models.Usuario;

import java.util.ArrayList;
import java.util.List;

/** 
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 *  
 * @author jluceroc
 * @version $Revision: 1.0 $ <p>[$Author: jluceroc $, $Date: 29 oct. 2021 $]</p>
*/
@RestController
public class UsuarioController {

	@Autowired
	private UsuarioDao usuarioDao;

	@RequestMapping(value = "api/usuario/{id}", method = RequestMethod.GET)
	public Usuario getUsuario(@PathVariable Long id) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Javier");
		usuario.setId(id);
		usuario.setApellido("Lucero");
		usuario.setEmail("1234@gmail.com");
		
		return usuario;
	}

	@RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
	public List<Usuario> getUsuarios() {
		return usuarioDao.getUsuarios();
	}

	@RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
	public void registrarUsuario(@RequestBody Usuario usuario) {
		Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2i);
		String hash = argon2.hash(1,1024,1,usuario.getPassword());
		usuario.setPassword(hash);
		usuarioDao.registrar(usuario);
	}
	
	@RequestMapping(value = "usuario2")
	public Usuario editar() {
		Usuario usuario = new Usuario();
		usuario.setNombre("Javier");
		usuario.setApellido("Lucero");
		usuario.setEmail("1234@gmail.com");
		
		return usuario;
	}

	@RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
	public void eliminar(@PathVariable Long id) {
		usuarioDao.eliminar(id);
	}
	
	@RequestMapping(value = "usuario4")
	public Usuario buscar() {
		Usuario usuario = new Usuario();
		usuario.setNombre("Javier");
		usuario.setApellido("Lucero");
		usuario.setEmail("1234@gmail.com");
		
		return usuario;
	}
}
