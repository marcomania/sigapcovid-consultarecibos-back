package edu.moduloalumno.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
@Data
public class UsuarioJOINAlumnoPrograma {
	private Integer idUsuario;
	private String userName;
	private String pass;
	private String codAlumno;
	private String apePaterno;
	private String apeMaterno;
	private String nomAlumno;
	private String dniM;
	private String correo;
}

