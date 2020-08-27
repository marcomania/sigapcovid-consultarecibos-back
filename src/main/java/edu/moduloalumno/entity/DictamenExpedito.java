package edu.moduloalumno.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class DictamenExpedito implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int idDictamen;
    private Date fechaDictamen;
    private String nroDictamen;
    private Tesis idtesis;

    public DictamenExpedito(int idDictamen) {
        this.idDictamen = idDictamen;
    }

}
