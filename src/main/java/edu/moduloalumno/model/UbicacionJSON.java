package edu.moduloalumno.model;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UbicacionJSON implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer idUbicacion;
    private String descripcion;

    public UbicacionJSON(Integer idUbicacion) {
        this.idUbicacion = idUbicacion;
    }
}
