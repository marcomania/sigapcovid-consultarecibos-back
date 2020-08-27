package edu.moduloalumno.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
@Data
public class AuditoriaPK implements Serializable {
	private static final long serialVersionUID = 1L;

	private int idAdmin;
    private int idRec;

}
