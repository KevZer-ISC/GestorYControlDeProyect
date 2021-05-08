package com.proyectogestorycontrol.models.entity;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Alumno implements Serializable {
	
	private static final long serialVersionUID =1L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)     
	private Long id;
	private String DNI;
	private String nombres;
	private String Apellidos;
	private byte sexo;
	private String direccion;
	private Date FechaNacimiento;
	private String Codigo;
	@OneToOne
	private Login login;
	@ManyToOne
	private Escuela escuela;
	
	@ManyToMany(targetEntity=Proyecto.class)
	 private Set proyecto;
	
	@ManyToOne
	private Curso curso;
}
