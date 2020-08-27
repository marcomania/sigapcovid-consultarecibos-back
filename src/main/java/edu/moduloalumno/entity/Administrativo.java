package edu.moduloalumno.entity;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Administrativo implements Serializable {
    private static final long serialVersionUID = 1L;
   
    private int idAdmin;
    private String nombres;
    private String apellidos;
    private String codigo;
    private String dni;
    private String email;
    private String telefono;
    private List<Auditoria> auditoriaList;
    private Usuario idUsuario;

    public Administrativo(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public Administrativo(int idAdmin, String nombres, String apellidos, String codigo, String dni, String email,
            String telefono) {
        this.idAdmin = idAdmin;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigo = codigo;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
    }
}
