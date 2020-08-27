package edu.moduloalumno.model;

import java.io.Serializable;
import edu.moduloalumno.entity.ClasePagos;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ConceptoJSON implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer idConcepto;
    private String concepto;
    private String concepA;
    private String concepB;
    private String descripcion;
    private ClasePagos clasePagos;


    public ConceptoJSON(Integer idConcepto) {
        this.idConcepto = idConcepto;
    }

    public ConceptoJSON(Integer idConcepto, String concepto, String concepA, String concepB) {
        this.idConcepto = idConcepto;
        this.concepto = concepto;
        this.concepA = concepA;
        this.concepB = concepB;
    }
}
