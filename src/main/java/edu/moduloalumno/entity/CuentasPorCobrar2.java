package edu.moduloalumno.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class CuentasPorCobrar2 {
	private Integer id_programa;
	private String id_moneda;
	private Integer id_concepto;
	private String cod_alumno;
	private String ape_paterno;
	private String ape_materno;
	private String nom_alumno;
	private Integer n_prioridad;
	private String sigla_programa;
	private String anio_ingreso;
	private String cod_perm;
	private Integer max_anio_estudio;
	private Integer beneficio_otorgado;
	private String autorizacion;
	private String moneda;//cambia
	private Integer n_prioridad2;
	private String concepto;
	private String descripcion_min;
	private Double importe_xpagar;
	private Double importe_pagado;
	private Double deuda;
	private String estado;
	private String coe_alumno;
	private String coe_alu_personal;
	private String tel_alu_movil;
	private String tel_alumno;
	private String des_doc_identidad;
	private String did_alumno;
	private String dir_tip_via;
	private String dir_tip_via_nom;
	private Integer dir_num_puerta;
	private String dir_num_piso;
	private String dir_num_dpto;
	private String dir_num_mz;
	private String dir_num_lote;
	private String dir_num_km;
	private String dir_tip_loc;
	private String dir_tip_loc_nom;
	private String departamento;
	private String provincia;
	private String distrito;
}
