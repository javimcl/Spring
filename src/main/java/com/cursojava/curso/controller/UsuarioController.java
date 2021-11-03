/*
 * Copyright 2021 INSTITUTO ECUATORIANO DE SEGURIDAD SOCIAL - ECUADOR 
 * Todos los derechos reservados
 */ 
package com.cursojava.curso.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

	@RequestMapping(value = "usuario/{id}")
	public Usuario getUsuario(@PathVariable Long id) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Javier");
		usuario.setId(id);
		usuario.setApellido("Lucero");
		usuario.setEmail("1234@gmail.com");
		
		return usuario;
	}

	@RequestMapping(value = "usuarios")
	public List<Usuario> getUsuarios() {

		List<Usuario> usuarios = new ArrayList<>();
		Usuario usuario = new Usuario();
		usuario.setNombre("Javier");
		usuario.setId(1L);
		usuario.setApellido("Lucero");
		usuario.setEmail("1234@gmail.com");
		usuario.setTelefono("022365214");
		usuarios.add(usuario);
		Usuario usuario2 = new Usuario();
		usuario2.setNombre("Maria");
		usuario2.setId(2L);
		usuario2.setApellido("Lopez");
		usuario2.setEmail("1234@gmail.com");
		usuario2.setTelefono("022652314");
		usuarios.add(usuario2);
		Usuario usuario3 = new Usuario();
		usuario3.setNombre("Carlos");
		usuario3.setId(3L);
		usuario3.setApellido("Suarez");
		usuario3.setEmail("1234@gmail.com");
		usuario3.setTelefono("0265321124");
		usuarios.add(usuario3);

		return usuarios;
	}
	
	@RequestMapping(value = "usuario2")
	public Usuario editar() {
		Usuario usuario = new Usuario();
		usuario.setNombre("Javier");
		usuario.setApellido("Lucero");
		usuario.setEmail("1234@gmail.com");
		
		return usuario;
	}
	
	@RequestMapping(value = "usuario3")
	public Usuario eliminar() {
		Usuario usuario = new Usuario();
		usuario.setNombre("Javier");
		usuario.setApellido("Lucero");
		usuario.setEmail("1234@gmail.com");
		
		return usuario;
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
