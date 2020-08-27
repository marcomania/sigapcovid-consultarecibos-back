package edu.moduloalumno.entity;

import lombok.Data;

@Data
public class CuentasPorCobrar {
	String cod_alumno;
	String ape_paterno;
	String ape_materno;
	String nom_alumno;
	String sigla_programa;
	String cod_perm;
	Integer max_anio_estudio;
	Integer beneficio_otorgado;
	String autorizacion;
	String moneda;//cambia
	Integer n_prioridad;
	String concepto;
	String descripcion_min;
	Double importe_xpagar;
	Double importe_pagado;
	Double deuda;
	String estado;
}
