package edu.moduloalumno.entity;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Perfil implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int idPerfil;
    private String nombreTipo;
    private List<Modulo> moduloList;
    private List<PerfilModulo> perfilModuloList;
    private List<UsuarioPerfil> usuarioPerfilList;

    public Perfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public Perfil(int idPerfil, String nombreTipo) {
        this.idPerfil = idPerfil;
        this.nombreTipo = nombreTipo;
    }
}
