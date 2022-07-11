
package Entidades;


public class Casa extends Propiedad{
    
    public boolean poseeGaraje;

    public Casa() {
    }

    public Casa(boolean poseeGaraje, String direccion, int cantidadHabitaciones, float precioBase, boolean usoComercial, int cantidadInquilinos) {
        super(direccion, cantidadHabitaciones, precioBase, usoComercial, cantidadInquilinos);
        this.poseeGaraje = poseeGaraje;
    }

    public boolean isPoseeGaraje() {
        return poseeGaraje;
    }

    public void setPoseeGaraje(boolean poseeGaraje) {
        this.poseeGaraje = poseeGaraje;
    }
    
    public Object[] toArray(){//ME CONVIERTE EL OBJETO EN UNA FILA
        return new Object[]{direccion, cantidadHabitaciones, precioBase,usoComercial,cantidadInquilinos,poseeGaraje};
    }
}
