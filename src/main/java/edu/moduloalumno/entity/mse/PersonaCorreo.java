package edu.moduloalumno.entity.mse;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
@Data
public class PersonaCorreo implements Serializable{
	private static final long serialVersionUID = 8873550700983531796L;
	
	private Integer id;
	private Integer idTipoCorreo;
	private String correo;
}
