package edu.moduloalumno.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
@Data
public class UsuarioJOINPerfil {
	private Integer idUsuario;
    private String userName;
    private String pass;
    private boolean estadoUp;
    private Integer idPerfil;
}

