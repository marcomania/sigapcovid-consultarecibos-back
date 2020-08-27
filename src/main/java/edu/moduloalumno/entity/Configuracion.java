package edu.moduloalumno.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Configuracion implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int idConfiguracion;
    private String descripcion;
    private char estado;
    private ClasePagos idClasePagos;
}
