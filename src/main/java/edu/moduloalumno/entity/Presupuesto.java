package edu.moduloalumno.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Presupuesto implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer programa_presupuesto;
	private Integer id_programa;
	private Integer costo_credito;
	private Integer costo_total;
	
}
