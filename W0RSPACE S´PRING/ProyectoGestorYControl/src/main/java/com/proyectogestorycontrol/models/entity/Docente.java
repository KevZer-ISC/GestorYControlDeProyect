package com.proyectogestorycontrol.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Docente implements Serializable {
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
	private String CAMPO;
	private String CODIGO;
	@OneToOne
	private Login login;
	
}
