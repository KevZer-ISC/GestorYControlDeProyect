package com.proyectogestorycontrol.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Capitulo implements Serializable {
	private static final long serialVersionUID =1L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)     
	private Long id;
	private String NumeroCapitulo;
	private String codigo;
	private String Descripcion;
	@ManyToOne
	private Proyecto proyecto;
	
	
}
