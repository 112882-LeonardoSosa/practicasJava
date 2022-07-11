
package MainClass;


public class Empleado {
    private int legajo = 0;
    private int faltas = 0;
    private double cantMinutosTarde = 0;
    
    // 1 falta = 480 minutos
    
    public Empleado(int legajo, int faltas, double cantMinutos) {
        this.legajo = legajo;
        this.faltas = faltas;
        this.cantMinutosTarde = cantMinutos;
    }
    

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public double getCantMinutosTarde() {
        return cantMinutosTarde;
    }

    public void setCantMinutosTarde(double cantMinutosTarde) {
        this.cantMinutosTarde = cantMinutosTarde;
    }
    
    public int legajo(){
        return this.legajo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "legajo=" + legajo + ", faltas=" + faltas + ", cantMinutosTarde=" + cantMinutosTarde + '}';
    }
    
    
}
