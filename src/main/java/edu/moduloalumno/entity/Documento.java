package edu.moduloalumno.entity;


import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Documento implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int id;
    private int idAlumno;
    private int numero;
    private int concepto;
    private String descripcion;
    private Date fecha;
    private int importe;
    private String estadoRegistro;
    private String estadoRecibo;

    public Documento(int id) {
        this.id = id;
    }
}
