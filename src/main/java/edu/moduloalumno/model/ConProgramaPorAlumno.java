package edu.moduloalumno.model;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ConProgramaPorAlumno implements Serializable {
    private static final long serialVersionUID = 1L;
    private String codAlumno;
    private String anioIngreso;
    private String anioEgreso;
    private String nomPrograma;
    private String siglaPrograma;

}
