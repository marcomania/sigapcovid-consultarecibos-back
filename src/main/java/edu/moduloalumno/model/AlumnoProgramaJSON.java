package edu.moduloalumno.model;

import java.io.Serializable;

import edu.moduloalumno.entity.Programa;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class AlumnoProgramaJSON implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String codAlumno;
    private String apePaterno;
    private String apeMaterno;
    private String nomAlumno;
    private String codEspecialidad;
    private String codTipIngreso;
    private String codSitu;
    private String codPerm;
    private String anioIngreso;
    private String dniM;
	private String correo;
	private String idTipGrado;
    private Programa programa;

    public AlumnoProgramaJSON(String codAlumno) {
        this.codAlumno = codAlumno;
    }

    public AlumnoProgramaJSON(String codAlumno, String apePaterno, String nomAlumno) {
        this.codAlumno = codAlumno;
        this.apePaterno = apePaterno;
        this.nomAlumno = nomAlumno;
    }
}
