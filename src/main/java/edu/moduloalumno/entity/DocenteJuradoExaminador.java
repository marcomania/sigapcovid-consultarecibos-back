package edu.moduloalumno.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class DocenteJuradoExaminador implements Serializable {
    private static final long serialVersionUID = 1L;
    
    protected DocenteJuradoExaminadorPK docenteJuradoExaminadorPK;
    private String tipo;
    private DesignacionJuradoExaminador designacionJuradoExaminador;
    private Docente docente;

    public DocenteJuradoExaminador(DocenteJuradoExaminadorPK docenteJuradoExaminadorPK) {
        this.docenteJuradoExaminadorPK = docenteJuradoExaminadorPK;
    }

    public DocenteJuradoExaminador(int iddocente, int iddesignacion) {
        this.docenteJuradoExaminadorPK = new DocenteJuradoExaminadorPK(iddocente, iddesignacion);
    }
}
