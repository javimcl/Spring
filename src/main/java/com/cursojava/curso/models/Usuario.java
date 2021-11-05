/*
 * Copyright 2021 INSTITUTO ECUATORIANO DE SEGURIDAD SOCIAL - ECUADOR 
 * Todos los derechos reservados
 */
package com.cursojava.curso.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <b> Incluir aqui la descripcion de la clase. </b>
 * 
 * @author jluceroc
 * @version $Revision: 1.0 $
 *          <p>
 *          [$Author: jluceroc $, $Date: 29 oct. 2021 $]
 *          </p>
 */
@Entity
@Table(name = "usuarios")
public class Usuario {

	@Getter
	@Setter
	@Id
	@Column(name = "id")
	private Long id;

	@Getter
	@Setter
	@Column(name = "nombre")
	private String nombre;

	@Getter
	@Setter
	@Column(name = "apellido")
	private String apellido;

	@Getter
	@Setter
	@Column(name = "email")
	private String email;

	@Getter
	@Setter
	@Column(name = "telefono")
	private String telefono;

	@Getter
	@Setter
	@Column(name = "password")
	private String password;


}
