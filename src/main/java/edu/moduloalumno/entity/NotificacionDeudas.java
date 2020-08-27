package edu.moduloalumno.entity;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class NotificacionDeudas {
	private Integer id_notificacion_deudas;
	private String cod_alumno;
	private Integer id_programa;
	private Integer n_notificacion;
	private Integer anio_notificacion;
	private Date fecha_notificacion;
	private String id_moneda;
	private Integer id_concepto;
	private Double importe_deuda;
	private String l_ultimo;
}
