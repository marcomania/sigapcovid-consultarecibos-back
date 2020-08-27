package edu.moduloalumno.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor 
@Data
public class Preferencia implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int idPreferencia;
    private Ciclo idCiclo;
    private Curso idCurso;
    private Docente idDocente;

    public Preferencia(int idPreferencia) {
        this.idPreferencia = idPreferencia;
    }
}
