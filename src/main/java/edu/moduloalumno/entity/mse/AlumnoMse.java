package edu.moduloalumno.entity.mse;

import java.io.Serializable;
import java.sql.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AlumnoMse implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String codigoAlumno;
    private String dni;    
    private String apellidoPaterno;    
    private String apellidoMaterno;    
    private String nombre;
    private Date fechaNacimiento;    
    private String domicilioActual;    
    private String distrito;
    private String telefonoFijo;
    private String telefonoCelular;
    private String correoPersonal;
    private String correoLaboral;   
}
