package edu.moduloalumno.entity.mse;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
@Data
public class Programa implements Serializable{
	private static final long serialVersionUID = -8148498937759494089L;
	
	private Integer id;
	private String nombre;
	private String sigla;
	private String tipoGrado;
	private Integer facultadId;
	private boolean vigencia;
	private Integer prioridad;
}
