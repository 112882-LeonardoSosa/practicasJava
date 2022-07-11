
package Entidades;


public class Clase {
    
    private String fecha;
    private String materia;
    private float costoBase;
    private String tipoClase;
    private int cantidadClases;
    private boolean llegoTarde;

    public Clase() {
    }

    public Clase(String fecha, String materia, float costoBase, String tipoClase, int cantidadClases, boolean llegoTarde) {
        this.fecha = fecha;
        this.materia = materia;
        this.costoBase = costoBase;
        this.tipoClase = tipoClase;
        this.cantidadClases = cantidadClases;
        this.llegoTarde = llegoTarde;
        
    }

    public boolean isLlegoTarde() {
        return llegoTarde;
    }

    public void setLlegoTarde(boolean llegoTarde) {
        this.llegoTarde = llegoTarde;
    }
    

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public float getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(float costoBase) {
        this.costoBase = costoBase;
    }

    public String getTipoClase() {
        return tipoClase;
    }

    public void setTipoClase(String tipoClase) {
        this.tipoClase = tipoClase;
    }

    public int getCantidadClases() {
        return cantidadClases;
    }

    public void setCantidadClases(int cantidadClases) {
        this.cantidadClases = cantidadClases;
    }
    
    public Object[] toArray(){//ME CONVIERTE EL OBJETO EN UNA FILA
        return new Object[]{fecha, materia, llegoTarde,tipoClase,costoBase,cantidadClases};
    }
}
