package edu.moduloalumno.entity;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class Modulo implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int idMod;
    private String nombre;
    private List<Perfil> perfilList;
    private List<PerfilModulo> perfilModuloList;
    private List<UsuarioModulo> usuarioModuloList;

    public Modulo(int idMod) {
        this.idMod = idMod;
    }

    public Modulo(int idMod, String nombre) {
        this.idMod = idMod;
        this.nombre = nombre;
    }
}
