package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Profesor {

    private List<Clase> clases;

    public Profesor() {
        clases = new ArrayList<>();
    }

    public void addClase(Clase c) {
        if (c != null) {
            clases.add(c);
        }
    }
    
    public float totalGanancias(){
        float total = 0;
        
        for (Clase clase : clases) {
            total+= clase.getCostoBase() * clase.getCantidadClases();
            
        }
        return total;
    }
    
    public float llegoTarde(){
        float total = 0;
        float aumento = 1.20f;
        
        for (Clase clase : clases) {      
            if (clase.isLlegoTarde()) {
                total = clase.getCostoBase() * clase.getCantidadClases() * aumento;
            }
        }
        return total;
    }
    
    public int cantidadClases(float importe){
        int cantidad = 0;
        for (Clase clase : clases) {
            if (clase.getCostoBase() * clase.getCantidadClases() > importe) {
                cantidad++;
            }
            
        }
        return cantidad;
    }
    
    //NOMBRE DE LA MATERIA CON MAYOR TARIFA Y QUE SEA INDIVIDUAL
    public Clase mayorTarifa(){
        Clase mayor = clases.get(0);
        for (Clase clase : clases) {
            if (clase.getCostoBase() > mayor.getCostoBase() && clase.getTipoClase()=="Individual") {
                mayor = clase;
            }
        }
        return mayor;
    }
    
    public Clase[] obtenerTodos() {

        return clases.toArray(new Clase[clases.size()]);

    }
    

}
