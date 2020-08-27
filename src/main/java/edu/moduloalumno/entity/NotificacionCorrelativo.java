package edu.moduloalumno.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
@Data
public class NotificacionCorrelativo {
	private String anio;
	private Integer n_correlativo;
	private String l_ultimo;
}
