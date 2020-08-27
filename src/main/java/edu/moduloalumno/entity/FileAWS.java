package edu.moduloalumno.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class FileAWS implements Serializable {
    private static final long serialVersionUID = 7611789879983997102L;
    private String url;   
}

