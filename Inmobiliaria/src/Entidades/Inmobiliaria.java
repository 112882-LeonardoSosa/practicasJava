
package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Inmobiliaria {
    
    private List<Propiedad> propiedades;

    public Inmobiliaria() {
        propiedades = new ArrayList<>();
    }
    
    public void agregarPropiedad(Propiedad p){
        if (p != null) {
            propiedades.add(p);
        }
    }
    
    public Propiedad[] obtenerTodos() {

        return propiedades.toArray(new Propiedad[propiedades.size()]);

    }
    
    public float promedioAlquileres(){
        
        float promedio = 0;
        for (Propiedad p : propiedades) {
            if (p.getCantidadInquilinos()==2) {
                promedio = p.getPrecioBase() / propiedades.size();
            }
        }
        
        return promedio;
    }
    
    public int cantidadCasas(){
        int cantidad=0;
        for (Propiedad p : propiedades) {
            if (p.cantidadHabitaciones >= 3) {
                cantidad++;
            }
        }
        return cantidad;
    }
    
    
}
