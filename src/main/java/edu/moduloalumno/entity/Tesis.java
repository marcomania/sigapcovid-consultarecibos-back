package edu.moduloalumno.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Tesis implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int idtesis;
    private String idalumno;
    private Date fechaInscripcion;
    private String titulo;
    private String nroInscripcion;
    private int calificacion;
    private Date fechaSustentacion;
    private Date horaSustentacion;
    private List<DictamenExpedito> dictamenExpeditoList;
    private List<DesignacionJuradoExaminador> designacionJuradoExaminadorList;
    private List<DesignacionJuradoInformante> designacionJuradoInformanteList;
    private Docente idDocente;

    public Tesis(int idtesis) {
        this.idtesis = idtesis;
    }
}
