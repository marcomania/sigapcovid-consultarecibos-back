package edu.moduloalumno.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
@Data
public class AlumnoProgramaJOINProgramaJOINAlumno {
	private int idAlumno;
	private String apeNom;
	private String codAlumno;
	private int idPrograma;
	private String nomPrograma;
	private String siglaPrograma;
}
