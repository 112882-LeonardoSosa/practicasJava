
package Entidades;


public class Departamento extends Propiedad{
    
    private float precioExpensas;

    public Departamento() {
    }

    public Departamento(float precioExpensas, String direccion, int cantidadHabitaciones, float precioBase, boolean usoComercial, int cantidadInquilinos) {
        super(direccion, cantidadHabitaciones, precioBase, usoComercial, cantidadInquilinos);
        this.precioExpensas = precioExpensas;
    }

    public float getPrecioExpensas() {
        return precioExpensas;
    }

    public void setPrecioExpensas(float precioExpensas) {
        this.precioExpensas = precioExpensas;
    }
    
        public Object[] toArray(){//ME CONVIERTE EL OBJETO EN UNA FILA
        return new Object[]{direccion, cantidadHabitaciones, precioBase,usoComercial,cantidadInquilinos,precioExpensas};
    }
        
}
