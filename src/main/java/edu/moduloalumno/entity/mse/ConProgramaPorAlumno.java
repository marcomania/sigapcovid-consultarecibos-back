package edu.moduloalumno.entity.mse;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ConProgramaPorAlumno implements Serializable {
	private static final long serialVersionUID = 1L;

	private String codAlumno;
	private String anioIngreso;
	private String anioEgreso;
	private String nomPrograma;
	private String siglaPrograma;
	private Integer id_programa;
}
