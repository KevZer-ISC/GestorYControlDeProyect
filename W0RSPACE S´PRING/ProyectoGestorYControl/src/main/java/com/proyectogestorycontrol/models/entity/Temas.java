package com.proyectogestorycontrol.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Temas implements Serializable {
	private static final long serialVersionUID =1L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)     
	private Long id;
	private String objetivos;
	private String resumen;
	private String Tipo_diseño_de_investigación;
	private String CategoríasSubcategoríasymatrizdecategorización;
	private String Escenario_de_estudio;
	private String Técnicas_instrumentos_recolección_datos;
	private String Procedimiento;
	private String Rigorcientífico;
	private String Método_de_análisis_de_datos;
	private String  éticos;
	private String RecursosyPresupuesto;
	private String Financiamiento;
	private String CronogramadeEjecución;
	
	@ManyToOne
	private Capitulo capitulo;
	
	
}
