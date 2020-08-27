package edu.moduloalumno.entity.mse;

import java.io.Serializable;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
@Data 
public class Formacion implements Serializable {
	private static final long serialVersionUID = -9196886506242402566L;
	
	private Integer formacion_id;
	private Integer modalidad;
	private Integer persona_id;
	private String codigoPersona;
	private Integer id_programa;
	private String nombrePrograma;
	private String siglaPrograma;
	private Integer nivel_id;
	private Integer institucion_id;
	private String institucion_desc;
	private String formacion_calumno;
	private Date formacion_fingreso;
	private Date formacion_fegreso;
	private Date formacion_fexped_grado;
}
