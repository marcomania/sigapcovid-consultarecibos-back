package edu.moduloalumno.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class Ciclo implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int idCiclo;
    private String nomCiclo;
    private Date fechaInicio;
    private Date fechaFin;
    private Boolean estado;
    private List<Disponibilidad> disponibilidadList;
    private List<Preferencia> preferenciaList;

    public Ciclo(int idCiclo) {
        this.idCiclo = idCiclo;
    }

    public Ciclo(int idCiclo, String nomCiclo) {
        this.idCiclo = idCiclo;
        this.nomCiclo = nomCiclo;
    }
}
