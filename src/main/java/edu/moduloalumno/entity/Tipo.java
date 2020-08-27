package edu.moduloalumno.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Tipo implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Integer idTipo;
    private String descripcion;

    public Tipo(Integer idTipo) {
        this.idTipo = idTipo;
    }
}
