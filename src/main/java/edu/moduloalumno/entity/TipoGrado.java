package edu.moduloalumno.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class TipoGrado implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String idTipGrado;
    private String nomTipGrado;

    public TipoGrado(String idTipGrado) {
        this.idTipGrado = idTipGrado;
    }
}
