/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestores;

import entidades.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leos_
 */
public class GestorPersona {
    
    private ArrayList<Persona> personas;

    public GestorPersona() {
        
        personas = new ArrayList<>();
    }
    
    public void agregarPersona(Persona persona){
        
        if (persona != null) {           
            personas.add(persona);
        }
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }
    
    
    
}
