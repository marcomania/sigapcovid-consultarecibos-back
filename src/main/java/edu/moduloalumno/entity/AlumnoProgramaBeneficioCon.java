package edu.moduloalumno.entity;


import java.util.Date;

import lombok.Data;

@Data
public class AlumnoProgramaBeneficioCon {
	private String cod_alumno;
//	private Integer id_programa;
	private Integer id_beneficio;
	private Integer benef_otrogado;
	private String benef_max;
	private String tipo;
	private String autorizacion;
	private String resolucion;
	private Integer id_bc;
	private String condicion;
	private Date fecha;
	private Integer id_abp;
	private String criterio;
	private String observacion;
}
