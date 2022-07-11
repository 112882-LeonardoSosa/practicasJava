
package entidades;


public class Paciente {
    
    
    private String nombreCompleto;
    private int edad;
    private boolean obraSocial;
    private int sesiones;

    public Paciente(String nombreCompleto, int edad, boolean obraSocial, int sesiones) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.obraSocial = obraSocial;
        this.sesiones = sesiones;
    }

    public Paciente() {
    }
    
    
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

    public int getSesiones() {
        return sesiones;
    }

    public void setSesiones(int sesiones) {
        this.sesiones = sesiones;
    }

    @Override
    public String toString() {
        return "Paciente: " + nombreCompleto + " Obra Social: " + obraSocial + " Cantidad Sesiones: " + sesiones;
    }
    
    public Object[] toArray(){//ME CONVIERTE EL OBJETO EN UNA FILA
        return new Object[]{nombreCompleto, edad, obraSocial,sesiones};
    }
    
     public float calcularMontoSesiones(){
        
        int valorSesion = 500;
        if (obraSocial) {
            valorSesion=200;
            
        }
        return sesiones * valorSesion;
    }
}
