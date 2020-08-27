package edu.moduloalumno.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
@Data
public class Facultad implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Integer idFacultad;
    private String nombre;
    
    public Facultad(Integer idFacultad) {
        this.idFacultad = idFacultad;
    }

}
