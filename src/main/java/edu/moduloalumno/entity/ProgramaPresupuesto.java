
package edu.moduloalumno.entity;

import lombok.Data;

@Data
public class ProgramaPresupuesto {
	private String ciclo;
	private String concepto;
	private String descripcion_min;
	private String moneda;
	private Integer importe;
}
