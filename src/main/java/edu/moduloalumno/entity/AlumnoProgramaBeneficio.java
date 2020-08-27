package edu.moduloalumno.entity;

import java.util.Date;

import lombok.Data;

@Data
public class AlumnoProgramaBeneficio {
	private String cod_alumno;
	private Integer id_beneficio;
	private Integer beneficio_otorgado;
	private String observacion;
	private Integer id_bcondicion;
	private String autorizacion;
	private Date fecha;
	private Integer id_abp;
	private Integer id_bcc;
	private boolean toQuery;

	public boolean getToQuery(){
		return toQuery;
	}
}