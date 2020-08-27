package edu.moduloalumno.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class AlumnoSemestre implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String semestre;
	private String codigo;
	private String nombre;
	private Integer presupuesto;
}
