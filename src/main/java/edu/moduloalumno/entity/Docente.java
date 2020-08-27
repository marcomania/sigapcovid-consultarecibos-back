/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class Docente implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int id;
    private String nombres;
    private String apellPat;
    private String apellMat;
    private String pais;
    private String tipoDocument;
    private String nroDocument;
    private String codigo;
    private String telefono;
    private String celular;
    private String email;
    private String linkedInId;
    private String genero;
    private String pagWeb;
    private String foto;
    private Date fechaNac;
    private String direccion;
    private String mayorGrado;
    private String mencGrado;
    private String universidad;
    private String paisGrado;
    private String cv;
    private String fechIngreso;
    private String suneduLey;
    private String nivelPrograma;
    private String categoria;
    private String regimenDedicacion;
    private String horasSemanales;
    private String investigador;
    private String dina;
    private String perAcademico;
    private String observacion;
    private Date resetPasswordExpires;
    private String resetPasswordToken;
    private Date createdAt;
    private Date updatedAt;
    private int logins;
    private Object profile;
    private Object tokens;
    private List<DesignacionJuradoInformante> designacionJuradoInformanteList;
    private List<DatosAcademicos> datosAcademicosList;
    private List<Tesis> tesisList;
    private List<DocenteJuradoExaminador> docenteJuradoExaminadorList;
    private Usuario idUsuario;
    private List<Disponibilidad> disponibilidadList;
    private List<Preferencia> preferenciaList;

    public Docente(int id) {
        this.id = id;
    }

    public Docente(int id, String email) {
        this.id = id;
        this.email = email;
    }

}
