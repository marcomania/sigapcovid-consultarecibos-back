package edu.moduloalumno.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class Recaudaciones implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer idRec;
	private Integer idAlum;
	private String apeNom;
	private String concepto;
	private String numero;
	private String dni;
	private String nombre;
    private String moneda;
    private double importe;
    private Date fecha;
    private String codAlum;
    private Integer idProg;
    private String siglaProg;
	private String observacion;
}
