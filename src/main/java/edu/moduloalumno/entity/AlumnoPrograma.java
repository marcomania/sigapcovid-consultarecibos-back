package edu.moduloalumno.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class AlumnoPrograma implements Serializable {
	private static final long serialVersionUID = 1L;
   
    private String codAlumno;
    private String apePaterno;
    private String apeMaterno;
    private String nomAlumno;
    private String codEspecialidad;
    private String codTipIngreso;
    private String codSitu;
    private String codPerm;
    private String anioIngreso;
    private String dniM;
    private Integer idPrograma;
    private String nom_programa;
    private String siglaProg;
	private String idTipGrado;
}
