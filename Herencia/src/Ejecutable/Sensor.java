package Ejecutable;


public class Sensor extends Dispositivo {
    
    public float desde;
    public float hasta;
    public float valor;

    public Sensor(float desde, float hasta, float valor, int codigo, String nombre, int tipo, float precio) {
        super(codigo, nombre, tipo, precio);
        this.desde = desde;
        this.hasta = hasta;
        this.valor = valor;
    }
    
    public Sensor(){
        
    }
    
}
