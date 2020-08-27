package edu.moduloalumno.entity;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Ubicacion implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Integer idUbicacion;
    private String descripcion;
    private List<Recaudaciones> recaudacionesList;

    public Ubicacion(Integer idUbicacion) {
        this.idUbicacion = idUbicacion;
    }
}
