package edu.moduloalumno.entity.mse;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlumnoDomicilio implements Serializable{
    private static final long serialVersionUID = 3332162947038691155L;

    private Integer id;
    private String domicilio;
    private String ubigeo;
}