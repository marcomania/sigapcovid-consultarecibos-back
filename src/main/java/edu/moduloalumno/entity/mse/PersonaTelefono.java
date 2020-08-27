package edu.moduloalumno.entity.mse;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
@Data
public class PersonaTelefono implements Serializable {
	private static final long serialVersionUID = 3137218832177769022L;
	
	private Integer idPersona;
	private Integer idTipoTelefono;
	private Integer numeroTelefonico;
	
}
