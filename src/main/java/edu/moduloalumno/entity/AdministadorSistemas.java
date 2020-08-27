package edu.moduloalumno.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
@Data
public class AdministadorSistemas implements Serializable {
    private static final long serialVersionUID = 1L;
    
    int idAdmSis;
    private String nombAdmSis;
    private String apeAdmSis;
    private String codigoAdmSis;
    private String dniAdmSis;
    private String emailAdmSis;
    private String telefonoAdmSis;
    private Usuario idUsuario;

    public AdministadorSistemas(int idAdmSis) {
        this.idAdmSis = idAdmSis;
    }  
}