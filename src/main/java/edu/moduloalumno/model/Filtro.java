package edu.moduloalumno.model;

import lombok.Data;

@Data
public class Filtro {
	private String fechaFinal;
	private String nom_ape;
	private String fechaInicial;
	private String[] conceptos;
	private String[] recibos;
}