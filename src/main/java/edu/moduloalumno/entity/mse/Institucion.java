package edu.moduloalumno.entity.mse;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
@Data
public class Institucion implements Serializable {
	private static final long serialVersionUID = -6081458505609376949L;

	private Integer id;
	private Integer idEconomico;
	private Integer idTipoInst;
	private String instDesc;
	private String instDescMin;
	private String instIni;
}