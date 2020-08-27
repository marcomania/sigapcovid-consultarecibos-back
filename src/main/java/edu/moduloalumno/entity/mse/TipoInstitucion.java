package edu.moduloalumno.entity.mse;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
@Data
public class TipoInstitucion implements Serializable{
	private static final long serialVersionUID = 4014087573633311702L;
	
	private Integer id;
	private String descripcion;
	private String iniciales;
}
