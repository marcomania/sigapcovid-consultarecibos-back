package edu.moduloalumno.entity.mse;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
@Data
public class Nivel implements Serializable {
	private static final long serialVersionUID = 7611789879989597102L;

	private Integer nivel_id;
	private String nivel_desc;
	private String nivel_ini;
}
