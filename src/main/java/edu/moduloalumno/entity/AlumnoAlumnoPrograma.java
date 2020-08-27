package edu.moduloalumno.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class AlumnoAlumnoPrograma implements Serializable {
    private static final long serialVersionUID = 1L;
   
    private Integer idAlumno;
    private String codAlumno;
    private Integer idPrograma;
}
