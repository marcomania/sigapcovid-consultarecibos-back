package edu.moduloalumno.entity.mse;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Facultad implements Serializable{
	private static final long serialVersionUID = -6323747997565273411L;
	
	private Integer id;
	private String nombre;

}
