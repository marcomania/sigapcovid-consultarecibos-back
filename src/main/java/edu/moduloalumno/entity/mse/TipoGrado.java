package edu.moduloalumno.entity.mse;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
@Data
public class TipoGrado implements Serializable {
	private static final long serialVersionUID = 2472094005982315078L;
	
	private String id;
	private String nombre;
}
