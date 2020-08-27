package edu.moduloalumno.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Auditoria implements Serializable {
    private static final long serialVersionUID = 1L;
    
    protected AuditoriaPK auditoriaPK;
    private Date fecha;
    private Administrativo administrativo;
    private Recaudaciones recaudaciones;

    public Auditoria(AuditoriaPK auditoriaPK) {
        this.auditoriaPK = auditoriaPK;
    }

    public Auditoria(AuditoriaPK auditoriaPK, Date fecha) {
        this.auditoriaPK = auditoriaPK;
        this.fecha = fecha;
    }

    public Auditoria(int idAdmin, int idRec) {
        this.auditoriaPK = new AuditoriaPK(idAdmin, idRec);
    }
}
