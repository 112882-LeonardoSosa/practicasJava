
package Entidades;


public class Propiedad {
    
    protected String direccion;
    protected int cantidadHabitaciones;
    protected float precioBase;
    protected boolean usoComercial;
    protected int cantidadInquilinos;

    public Propiedad(String direccion, int cantidadHabitaciones, float precioBase, boolean usoComercial, int cantidadInquilinos) {
        this.direccion = direccion;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.precioBase = precioBase;
        this.usoComercial = usoComercial;
        this.cantidadInquilinos = cantidadInquilinos;
    }

    public Propiedad() {
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }

    public boolean isUsoComercial() {
        return usoComercial;
    }

    public void setUsoComercial(boolean usoComercial) {
        this.usoComercial = usoComercial;
    }

    public int getCantidadInquilinos() {
        return cantidadInquilinos;
    }

    public void setCantidadInquilinos(int cantidadInquilinos) {
        this.cantidadInquilinos = cantidadInquilinos;
    }
    
        public Object[] toArray(){//ME CONVIERTE EL OBJETO EN UNA FILA
        return new Object[]{direccion, cantidadHabitaciones, precioBase,usoComercial,cantidadInquilinos};
    }
    
}
