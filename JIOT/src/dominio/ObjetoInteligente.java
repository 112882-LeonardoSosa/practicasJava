/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leos_
 */
public abstract class ObjetoInteligente {
    
    private int id;
    private int estado;
    private String nombre;
    private final List<Alarma> alarmas;
    
    public ObjetoInteligente(){
        
        id = 0;
        estado = 1;
        nombre = "S/N";
        alarmas = new ArrayList<>();
    }

    public ObjetoInteligente(int id, int estado, String nombre) {
        this.id = id;
        this.estado = estado;
        this.nombre = nombre;
        alarmas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract void tomarComando(int valor);
    
    public int totalAlarmas(int tipo){//METODO QUE CUENTA EL TOTAL DE ALARMAS SEGUN TIPO INGRESADO
        int contador = 0;
        for (Alarma alarma : alarmas) {
            if (alarma.getTipo() == tipo) {
                contador++;
            }
        }
        
        
        return contador;
    }
        
    public String toString(){
        
        String aux = "Objeto Id: " + id + "|" + nombre;
        aux += "(" + alarmas.size() + ")";
        return aux;
    }
    
    protected void generarAlarma(Alarma alarma){
        if (alarma != null) {
            alarmas.add(alarma);
        }
    }
    
    
}
