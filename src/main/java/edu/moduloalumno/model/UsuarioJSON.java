package edu.moduloalumno.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
@Data
public class UsuarioJSON implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer idUsuario;
    private String userName;
    private String pass;
    
    public UsuarioJSON(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
}
