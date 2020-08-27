package edu.moduloalumno.model;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ClasePagosJSON implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Integer idClasePagos;
    private String descripcion;

    public ClasePagosJSON(Integer idClasePagos) {
        this.idClasePagos = idClasePagos;
    }
}
