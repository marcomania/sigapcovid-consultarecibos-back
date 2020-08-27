package edu.moduloalumno.model;

import java.io.Serializable;

import edu.moduloalumno.entity.Facultad;
import edu.moduloalumno.entity.Usuario;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class AlumnoJSON implements Serializable {
    private static final long serialVersionUID = 1L;
    @NonNull Integer idAlum;
    private String apeNom;
    private String codigo;
    private String dni;
    private Facultad facultad;
    private Usuario usuario;
}
