package dominio;

import java.util.ArrayList;
import java.util.List;

public class Taller {

    private List<Turnos> turnos;

    public Taller() {
        turnos = new ArrayList<>();//INICIALIZAMOS LA LISTA EN EL CONSTRUCTOR
    }

    public void agregarTurno(Turnos t) {

        if (t != null) {
            turnos.add(t);
        }
    }

    public Turnos[] obtenerTodos() {

        return turnos.toArray(new Turnos[turnos.size()]);

    }
    
    public float sumatoriaPresupuestos(){
        float total = 0;
        float total1 =0;
        float total2 = 0;
        
        for (Turnos turno : turnos) {
            
            if (Integer.parseInt(turno.getTipoDeProblema())==0) {
                total1 += turno.getPresupuesto();
            }
            if (Integer.parseInt(turno.getTipoDeProblema())==3) {
                total2 += turno.getPresupuesto();
            }           
        }
        total = total1 + total2;
        return total;
        
    }
    
    public String supera30Dias(){
        int supera = 0;
        for (Turnos turno : turnos) {
            supera += turno.getCantidadDias();
        }
        
        if (supera > 30) {
            return "Supera los 30 dias";
        }
        
        return "NO Supera los 30 dias";
    }
    
    public float promedioRecaudacion(){
        float promedio = 0;
        
        for (Turnos turno : turnos) {
            promedio += (turno.getPresupuesto() * turno.getCantidadDias()) / turnos.size();
        }
        
        return promedio;
    }
    
    
}
