package edu.moduloalumno.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
@Data
public class DatosAcademicos implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int idDatAcademicos;
    private String mencionGrado;
    private String centroEstudios;
    private String paisEstudios;
    private Docente idDocente;
    private TipoGrado idTipGrado;

}
