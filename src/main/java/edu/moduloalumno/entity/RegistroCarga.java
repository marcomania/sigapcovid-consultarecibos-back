package edu.moduloalumno.entity;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class RegistroCarga implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Integer idRegistro;
    private String nombreEquipo;
    private String ip;
    private String ruta;
    private Date fechaCarga;
    private List<Recaudaciones> recaudacionesList;
    private List<RecaudacionesFallidas> recaudacionesFallidasList;

    public RegistroCarga(Integer idRegistro) {
        this.idRegistro = idRegistro;
    }
}
