package edu.moduloalumno.entity;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
@Data
public class Curso implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int idCurso;
    private String nomCurso;
    private String numciclo;
    private String numcreditaje;
    private char tipocurso;
    private String planestudios;
    private Programa idPrograma;
    private List<Preferencia> preferenciaList;

    public Curso(int idCurso) {
        this.idCurso = idCurso;
    }
}
