
package entidades;

import java.util.ArrayList;


public class Paciente {
    
    private String nombreCompleto;
    private int edad;
    private boolean obraSocial;
    private ArrayList<Sesion> Sesiones;

    public Paciente() {
        Sesiones = new ArrayList<>();
    }
    
    

//    public Paciente(String nombreCompleto, int edad, boolean obraSocial, ArrayList<Sesion> Sesiones) {
//        this.nombreCompleto = nombreCompleto;
//        this.edad = edad;
//        this.obraSocial = obraSocial;
//        this.Sesiones = Sesiones;
//    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(boolean obraSocial) {
        this.obraSocial = obraSocial;
    }

    public ArrayList<Sesion> getSesiones() {
        return Sesiones;
    }
    
    public double montoTotal(){
        double total = 0;
        for (Sesion Sesione : Sesiones) {
            if (isObraSocial()==true) {
                Sesione.setPrecioCoseguro();
                total += Sesione.getPrecioCoseguro();
            }
            else
             Sesione.setPrecioParticular();
            total += Sesione.getPrecioParticular();                
        }
        return total;
    }
    
    public void addSesion(Sesion sesion) {
        if (sesion != null) {
            Sesiones.add(sesion);
        }
    }
    
    public float calcularMontoSesiones(){
        float total;
        int valorSesion = 500;
        if (obraSocial) {
            valorSesion=200;
            
        }
        return sesiones * valorSesion;
    }
    
}
