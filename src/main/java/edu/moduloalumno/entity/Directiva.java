package edu.moduloalumno.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
@Data
public class Directiva implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int idDirec;
    private String nombres;
    private String apellidos;
    private String codigo;
    private String dni;
    private String email;
    private String telefono;
    private Usuario idUsuario;

    public Directiva(int idDirec) {
        this.idDirec = idDirec;
    }

}
