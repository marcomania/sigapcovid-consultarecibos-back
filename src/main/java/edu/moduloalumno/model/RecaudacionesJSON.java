package edu.moduloalumno.model;

import java.io.Serializable;
import java.util.Date;

import edu.moduloalumno.entity.Alumno;
import edu.moduloalumno.entity.AlumnoPrograma;
import edu.moduloalumno.entity.Concepto;
import edu.moduloalumno.entity.RegistroCarga;
import edu.moduloalumno.entity.Tipo;
import edu.moduloalumno.entity.Ubicacion;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class RecaudacionesJSON implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer idRec;
    private String moneda;
    private String numero;
    private Double importe;
    private String carnet;
    private String autoseguro;
    private String ave;
    private String devolTran;
    private String observacion;
    private Date fecha;
    private String codAlum;
    private Integer idProg;    
    private Boolean validado;
    private Alumno alumno;
    private AlumnoPrograma alumnoPrograma;
    private Concepto concepto;
    private RegistroCarga registroCarga;
    private Tipo tipo;
    private Ubicacion ubicacion;

    public RecaudacionesJSON(Integer idRec) {
        this.idRec = idRec;
    }
}
