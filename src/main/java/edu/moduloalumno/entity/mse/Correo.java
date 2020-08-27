package edu.moduloalumno.entity.mse;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Correo implements Serializable {
	private static final long serialVersionUID = -4124233721777887072L;

	private String correo;
}
