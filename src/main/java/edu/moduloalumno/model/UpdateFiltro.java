package edu.moduloalumno.model;

import lombok.Data;

@Data
public class UpdateFiltro {
	private String fechaFinal;
	private String nombres;
	private String apellidos;
	private String fechaInicial;
	private String[] conceptos;
	private String[] recibos;
}