package edu.moduloalumno.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class DesignacionJuradoInformante implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int id;
    private Date fechaDesignacion;
    private String nroDesignacion;
    private List<Docente> docenteList;
    private Tesis idtesis;

    public DesignacionJuradoInformante(int id) {
        this.id = id;
    }
}
