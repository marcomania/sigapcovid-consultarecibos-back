package edu.moduloalumno.service;

import edu.moduloalumno.entity.UsuarioJOINAlumnoPrograma;

public interface IUsuarioJOINAlumnoProgramaService {
	
	UsuarioJOINAlumnoPrograma getUsuarioJOINAlumnoProgramaByUserPass(String userName, String pass);
	UsuarioJOINAlumnoPrograma getUpdateUsuarioJOINAlumnoPrograma(String userName, String mail, String pass);
	UsuarioJOINAlumnoPrograma getResetUsuarioJOINAlumnoPrograma(String mail, String userName);

}