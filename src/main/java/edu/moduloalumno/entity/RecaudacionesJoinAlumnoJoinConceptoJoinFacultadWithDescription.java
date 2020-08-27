package edu.moduloalumno.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class RecaudacionesJoinAlumnoJoinConceptoJoinFacultadWithDescription implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer r_id_tipo_recaudacion;
	private Integer c_id_tipo_recaudacion;
	private String descripcion_recaudacion;
	private RecaudacionesJOINAlumnoJOINConceptoJOINFacultad recaudaciones;
	
	public RecaudacionesJoinAlumnoJoinConceptoJoinFacultadWithDescription() {
		this.recaudaciones  = new RecaudacionesJOINAlumnoJOINConceptoJOINFacultad();
	}
}
