package edu.moduloalumno.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class DataActualizar {
	private String idRec;
	private String fecha;
	private String id_concepto;
	private String id_moneda;
	private String recibo;
	private String ciclo;
	private String importe;
	private String ubicacion;
	private String ctabanco;
	private String validado;
	private String repitencia;

	private Integer id_tipo_recaudacion;
}
