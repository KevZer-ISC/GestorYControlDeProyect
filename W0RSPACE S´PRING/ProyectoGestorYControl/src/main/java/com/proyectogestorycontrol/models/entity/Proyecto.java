package com.proyectogestorycontrol.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Proyecto implements Serializable {
	private static final long serialVersionUID =1L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)     
	private Long id;
	private String Titulo;
	private Date Fecha_Final;
	private Date Fecha_Inicio;
	private String Codigo;
	@ManyToOne
	private tipoDeProyecto tipodeproyecto;
	@ManyToOne
	private Docente docente;
}
