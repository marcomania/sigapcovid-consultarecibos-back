package edu.moduloalumno.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Alumno implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer idAlum;
    private String apeNom;
    private String codigo;
    private String dni;
    private Integer idFacultad;

    public Alumno(Integer idAlum) {
        this.idAlum = idAlum;
    }

    public Alumno(Integer idAlum, String apeNom) {
        this.idAlum = idAlum;
        this.apeNom = apeNom;
    }
    
}
