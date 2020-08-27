package edu.moduloalumno.entity.mse;

import java.io.Serializable;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
@Data
public class Persona implements Serializable{
	private static final long serialVersionUID = 7611789879989997102L;
	
	private Integer id;
	private String dni;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String nombres;
	private Date fechaNac;
	private Integer edad;
	private String ubigeo;
	private Integer numHijos;
	private Integer estadoCivil;
	private String ultimo;
	private Integer estado_id;
	private String codigoAlumnoPrograma;
	
}
