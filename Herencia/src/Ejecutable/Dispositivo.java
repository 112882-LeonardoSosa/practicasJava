package Ejecutable;


public class Dispositivo {
    
    protected int codigo;
    protected String nombre;
    private int tipo;
    private float precio;

    public Dispositivo(int codigo, String nombre, int tipo, float precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }
    
    //DEBEMOS GENERAR UN CONSTRUCTOR SIN PARAMETROS EN LA CLASE BASE
    public Dispositivo() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
    
}
