package com.proyectogestorycontrol.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Escuela implements Serializable {
	private static final long serialVersionUID =1L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)     
	private Long id;
	private String Nombre;
	private String Direccion;
	private String correo;
	private String telefono;
	@ManyToOne
	private Facultad facultad ;

}

