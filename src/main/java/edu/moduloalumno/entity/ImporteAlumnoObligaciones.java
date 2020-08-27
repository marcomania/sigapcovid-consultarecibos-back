package edu.moduloalumno.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
@Data
public class ImporteAlumnoObligaciones implements Serializable{
	private static final long serialVersionUID = 1L;
    
	private Integer id_importe_alumno_obligaciones;
    private Integer cod_alumno;
    private Integer cod_programa;
    private Integer cod_concepto;
    private double importe;
    private Integer id_tipo_obligacion;
    private String id_moneda;
    private Integer id_tobligacion_estado;
    private String descripcion;
    
}
