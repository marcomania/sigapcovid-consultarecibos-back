package edu.moduloalumno.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PerfilModulo implements Serializable {
    private static final long serialVersionUID = 1L;
    
    protected PerfilModuloPK perfilModuloPK;
    private boolean estadoPm;
    private Modulo modulo;
    private Perfil perfil;

    public PerfilModulo(PerfilModuloPK perfilModuloPK) {
        this.perfilModuloPK = perfilModuloPK;
    }

    public PerfilModulo(PerfilModuloPK perfilModuloPK, boolean estadoPm) {
        this.perfilModuloPK = perfilModuloPK;
        this.estadoPm = estadoPm;
    }

    public PerfilModulo(short idPerfil, short idMod) {
        this.perfilModuloPK = new PerfilModuloPK(idPerfil, idMod);
    }

}
