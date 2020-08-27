package edu.moduloalumno.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
@Data
public class Concepto implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Integer idConcepto;
    private String concepto;
    private String concepA;
    private String concepB;
    private String descripcion;
    private Integer idClasePagos;
}
