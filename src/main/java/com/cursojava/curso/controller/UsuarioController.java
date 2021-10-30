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
