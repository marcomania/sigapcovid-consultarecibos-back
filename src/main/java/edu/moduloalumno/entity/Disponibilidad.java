package edu.moduloalumno.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Disponibilidad implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int idDisponibilidad;
    private String hrInicio;
    private String hrFin;
    private String totHrs;
    private Ciclo idCiclo;
    private Dia idDia;
    private Docente idDocente;

    public Disponibilidad(int idDisponibilidad) {
        this.idDisponibilidad = idDisponibilidad;
    }

    public Disponibilidad(int idDisponibilidad, String hrInicio, String hrFin, String totHrs) {
        this.idDisponibilidad = idDisponibilidad;
        this.hrInicio = hrInicio;
        this.hrFin = hrFin;
        this.totHrs = totHrs;
    }

}
