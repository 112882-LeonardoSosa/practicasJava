/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimerosPasos;

import java.util.Date;

/**
 *
 * @author leos_
 */
public class Auto {
    
    String modelo;
    Date anioFabricacion;
    String patente;

    public String getModelo() {
        return modelo;
    }

    public Date getAnioFabricacion() {
        return anioFabricacion;
    }

    public String getPatente() {
        return patente;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnioFabricacion(Date anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Auto() {
    }

    public Auto(String modelo, Date anioFabricacion, String patente) {
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.patente = patente;
    }
    
    public void Antiguedad(){
        
        if (true) {
            
        }
    }
    
    
}
