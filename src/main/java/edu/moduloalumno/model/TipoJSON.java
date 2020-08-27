package edu.moduloalumno.model;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class TipoJSON implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer idTipo;
    private String descripcion;

    public TipoJSON(Integer idTipo) {
        this.idTipo = idTipo;
    }    
}
