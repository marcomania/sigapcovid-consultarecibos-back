package edu.moduloalumno.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
@Data
public class Programa implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Integer idPrograma;
    private String nomPrograma;
    private String siglaPrograma;
    private boolean vigenciaPrograma;
    private Integer idTipGrado;
    
    public Programa(Integer idPrograma) {
        this.idPrograma = idPrograma;
    }
}
