package edu.moduloalumno.entity;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Dia implements Serializable {
    private static final long serialVersionUID = 1L;
   
    private String idDia;
    private String nomDia;
    private List<Disponibilidad> disponibilidadList;

    public Dia(String idDia) {
        this.idDia = idDia;
    }

    public Dia(String idDia, String nomDia) {
        this.idDia = idDia;
        this.nomDia = nomDia;
    }

}
