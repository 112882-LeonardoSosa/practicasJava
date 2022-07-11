
package dominio;


public class Alarma {
    
    private int tipo;
    private int hora;
    private String descripcion;

    public Alarma() {
        tipo = 1;
        hora = 0;
        descripcion = "";
    }

    public Alarma(int tipo, int hora, String descripcion) {
        this.tipo = tipo;
        this.hora = hora;
        this.descripcion = descripcion;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Alarma{" + "tipo=" + tipo + ", hora=" + hora + ", descripcion=" + descripcion + '}';
    }
    
    
    
    
    
}
