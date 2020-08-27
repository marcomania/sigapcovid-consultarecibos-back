package edu.moduloalumno.entity;

import lombok.Data;

@Data
public class TipoBeneficio {
	private Integer id_tipo;
	private String tipo;
	private String resolucion;
	private String beneficio_max;	
}
