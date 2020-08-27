package edu.moduloalumno.entity;

import lombok.Data;

@Data
public class BeneficioReporteCiclo {
	private float ciclo;
	private float d_ciclo;
	private float epg;
	private float upg;
	private float d_epg;
	private float d_upg;
	private String tipo;
	private float Total;
	private float d_Total;
}
