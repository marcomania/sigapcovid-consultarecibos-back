package edu.moduloalumno.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UsuarioPerfil implements Serializable {
    private static final long serialVersionUID = 1L;
    
    protected UsuarioPerfilPK usuarioPerfilPK;
    private boolean estadoUp;
    private Perfil perfil;
    private Usuario usuario;

    public UsuarioPerfil(UsuarioPerfilPK usuarioPerfilPK) {
        this.usuarioPerfilPK = usuarioPerfilPK;
    }

    public UsuarioPerfil(UsuarioPerfilPK usuarioPerfilPK, boolean estadoUp) {
        this.usuarioPerfilPK = usuarioPerfilPK;
        this.estadoUp = estadoUp;
    }

    public UsuarioPerfil(int idUsuario, int idPerfil) {
        this.usuarioPerfilPK = new UsuarioPerfilPK(idUsuario, idPerfil);
    }

}
