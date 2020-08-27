package edu.moduloalumno.entity.mse;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CmbProgramas implements Serializable {

    private static final long serialVersionUID = 1L;
    private String value;
    private String label;

}
