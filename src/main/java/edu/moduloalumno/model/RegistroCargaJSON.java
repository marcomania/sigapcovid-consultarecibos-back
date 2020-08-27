package edu.moduloalumno.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class RegistroCargaJSON implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer idRegistro;
    private String nombreEquipo;
    private String ip;
    private String ruta;
    private Date fechaCarga;

    public RegistroCargaJSON(Integer idRegistro) {
        this.idRegistro = idRegistro;
    }
}
