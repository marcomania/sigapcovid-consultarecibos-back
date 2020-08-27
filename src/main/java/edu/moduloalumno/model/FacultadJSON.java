package edu.moduloalumno.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
@Data
public class FacultadJSON implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer idFacultad;
    private String nombre;

    public FacultadJSON(Integer idFacultad) {
        this.idFacultad = idFacultad;
    }
}
