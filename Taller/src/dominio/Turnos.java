
package dominio;


public class Turnos {
    
    private String patente;
    private String tipoDeProblema;
    private float presupuesto;
    private int cantidadDias;

    public Turnos() {
    }

    public Turnos(String patente, String tipoDeProblema, float presupuesto, int cantidadDias) {
        this.patente = patente;
        this.tipoDeProblema = tipoDeProblema;
        this.presupuesto = presupuesto;
        this.cantidadDias = cantidadDias;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getTipoDeProblema() {
        return tipoDeProblema;
    }

    public void setTipoDeProblema(String tipoDeProblema) {
        this.tipoDeProblema = tipoDeProblema;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }
    
    public Object[] toArray(){//ME CONVIERTE EL OBJETO EN UNA FILA
        return new Object[]{patente, tipoDeProblema, presupuesto,cantidadDias};
    }
}
