package edu.moduloalumno.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class TiposRecaudacion implements Serializable {
	private static final long serialVersionUID = 5884039246880863807L;

	private Integer id_tipo_recaudacion;
	private String desc_tipo_recaudacion;
}
