package edu.moduloalumno.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ClasePagos implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Integer idClasePagos;
	private String descripcion;
	
    public ClasePagos(Integer idClasePagos) {
        this.idClasePagos = idClasePagos;
    }
}
