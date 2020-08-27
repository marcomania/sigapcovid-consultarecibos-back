package edu.moduloalumno.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class RecaudacionesRaw implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int idRaw;
    private String moneda;
    private String dependencia;
    private String concep;
    private String concepA;
    private String concepB;
    private String numero;
    private String codigo;
    private String nombre;
    private int importe;
    private String carnet;
    private String autoseguro;
    private String ave;
    private String devolTran;
    private String observacion;
    private String fecha;

    public RecaudacionesRaw(int idRaw) {
        this.idRaw = idRaw;
    }
}
