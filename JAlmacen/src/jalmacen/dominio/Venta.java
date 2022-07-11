
package jalmacen.dominio;


public class Venta {
    
    private String nombreCliente;
    private double precio;
    private int dia;
    private int rubro;

    public Venta(String nombreCliente, double precio, int dia, int rubro) {
        this.nombreCliente = nombreCliente;
        this.precio = precio;
        this.dia = dia;
        this.rubro = rubro;
    }
    
    
    
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getRubro() {
        return rubro;
    }

    public void setRubro(int rubro) {
        this.rubro = rubro;
    }

    @Override
    public String toString() {
        return "Venta{" + "nombreCliente=" + nombreCliente + ", precio=" + precio + ", dia=" + dia + ", rubro=" + rubro + '}';
    }
    
    
    
    
}
