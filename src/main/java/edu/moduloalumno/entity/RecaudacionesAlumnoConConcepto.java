package edu.moduloalumno.entity;

import java.util.Date;

import lombok.Data;
@Data
public class RecaudacionesAlumnoConConcepto {
	private Integer idRec;
	private Integer idAlum;
	private String apeNom;
	private Integer ciclo;
	private String concepto;
	private Integer idconcepto;
	private String numero;
	private String dni;
	private String nombre;
    private String moneda;
    private String moneda2;
    private double importe;
    private float importe_tc;
    private Date fecha;
    private String anio_ingreso;
    private Integer idPrograma;
    private String nomPrograma;
    private String sigla_programa;
    private String codAlumno;
    private String estado;
    private String descripcion_ubi;
    private String descripcion_tipo;
    private String estado_civil;
	private boolean validado;
	private String repitencia;
	private String id_tip_grado;
	private String observacion;	
}
