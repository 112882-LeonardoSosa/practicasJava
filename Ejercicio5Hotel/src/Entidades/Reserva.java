
package Entidades;


public class Reserva {
    
    private int nroHabitacion;
    private int diasReservados;
    private boolean vigente;
    private String tipoReserva;
    private float tarifaDiaria;
    private int cantidadNinios;
    private float tarifaNinio;

    public Reserva() {
    }

    public Reserva(int nroHabitacion, int diasReservados, boolean vigente, String tipoReserva, float tarifaDiaria, int cantidadNinios, float tarifaNinio) {
        this.nroHabitacion = nroHabitacion;
        this.diasReservados = diasReservados;
        this.vigente = vigente;
        this.tipoReserva = tipoReserva;
        this.tarifaDiaria = tarifaDiaria;
        this.cantidadNinios = cantidadNinios;
        this.tarifaNinio = tarifaNinio;
    }
    
    
    public int getNroHabitacion() {
        return nroHabitacion;
    }

    public void setNroHabitacion(int nroHabitacion) {
        this.nroHabitacion = nroHabitacion;
    }

    public int getDiasReservados() {
        return diasReservados;
    }

    public void setDiasReservados(int diasReservados) {
        this.diasReservados = diasReservados;
    }

    public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }

    public float getTarifaDiaria() {
        return tarifaDiaria;
    }

    public void setTarifaDiaria(float tarifaDiaria) {
        this.tarifaDiaria = tarifaDiaria;
    }

    public float getTarifaNinio() {
        return tarifaNinio;
    }

    public void setTarifaNinio(float tarifaNinio) {
        this.tarifaNinio = tarifaNinio;
    }

    public int getCantidadNinios() {
        return cantidadNinios;
    }

    public void setCantidadNinios(int cantidadNinios) {
        this.cantidadNinios = cantidadNinios;
    }

    public String getTipoReserva() {
        return tipoReserva;
    }

    public void setTipoReserva(String tipoReserva) {
        this.tipoReserva = tipoReserva;
    }
    
    
    public Object[] toArray(){//ME CONVIERTE EL OBJETO EN UNA FILA
        return new Object[]{nroHabitacion, diasReservados, vigente,tipoReserva,tarifaDiaria,cantidadNinios,tarifaNinio};
    }
    
    
    
}
