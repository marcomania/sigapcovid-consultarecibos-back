/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.entity;

/**
 *
 * @author JUNIOR
 */
import java.io.Serializable;

/**
 *
 * @author JUNIOR
 */
public class FileAWS implements Serializable {

    private static final long serialVersionUID = 7611789879983997102L;
    private String url;
    
    public FileAWS(){}
    public FileAWS(String url){
        this.url=url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
    /*public void urlCompleto(String url){
        
        this.url= "https://imgvidco.s3.amazonaws.com/reciboAlumnos/"+url;
    }*/
}

