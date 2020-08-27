package edu.moduloalumno.model;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class TipoGradoJSON implements Serializable {
    private static final long serialVersionUID = 1L;

    private String idTipGrado;
    private String nomTipGrado;

    public TipoGradoJSON(String idTipGrado) {
        this.idTipGrado = idTipGrado;
    }
}
