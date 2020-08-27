package edu.moduloalumno.entity.mse;

import java.io.Serializable;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EjercicioProfesionalDocente implements Serializable{
	private static final long serialVersionUID = 3788006976218351970L;

	private Integer entidad;
	private String tipoEntidad;
	private String cargo;
	private String princFunc;
	private String tipoVincLab;
	private Date fechInic;
	private Date fechaFin;
	private String nomJefInmSup;
	private String corrJefInmSup;
}
