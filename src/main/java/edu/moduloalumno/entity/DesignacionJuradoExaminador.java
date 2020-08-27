package edu.moduloalumno.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class DesignacionJuradoExaminador implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int id;
    private String numeroDesignacion;
    private Date fechaDesignacion;
    private Tesis idtesis;
    private List<DocenteJuradoExaminador> docenteJuradoExaminadorList;

    public DesignacionJuradoExaminador(int id) {
        this.id = id;
    }

}
