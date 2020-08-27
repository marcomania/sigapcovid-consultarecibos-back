package edu.moduloalumno.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
@Data
public class ProgramaJSON implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer idPrograma;
    private String nomPrograma;
    private String siglaPrograma;
    private boolean vigenciaPrograma;
    private TipoGradoJSON tipoGrado;

    public ProgramaJSON(Integer idPrograma) {
        this.idPrograma = idPrograma;
    }

}
