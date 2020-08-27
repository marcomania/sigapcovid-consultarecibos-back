package edu.moduloalumno.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UsuarioModulo implements Serializable {
    private static final long serialVersionUID = 1L;
    
    protected UsuarioModuloPK usuarioModuloPK;
    private boolean estadoUm;
    private Modulo modulo;
    private Usuario usuario;

    public UsuarioModulo(UsuarioModuloPK usuarioModuloPK) {
        this.usuarioModuloPK = usuarioModuloPK;
    }

    public UsuarioModulo(UsuarioModuloPK usuarioModuloPK, boolean estadoUm) {
        this.usuarioModuloPK = usuarioModuloPK;
        this.estadoUm = estadoUm;
    }

    public UsuarioModulo(int idUsuario, short idMod) {
        this.usuarioModuloPK = new UsuarioModuloPK(idUsuario, idMod);
    }

}
