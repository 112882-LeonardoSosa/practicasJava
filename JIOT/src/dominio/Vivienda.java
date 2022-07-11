package dominio;

import java.util.ArrayList;

public class Vivienda {

    private String direccion;
    private String duenio;
    ArrayList<ObjetoInteligente> objetos;

    public Vivienda() {
    }

    public Vivienda(String direccion, String duenio) {
        this.direccion = direccion;
        this.duenio = duenio;
        objetos = new ArrayList<>();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public ArrayList<ObjetoInteligente> getObjetos() {
        return objetos;
    }

    public void setObjetos(ArrayList<ObjetoInteligente> objetos) {
        this.objetos = objetos;
    }

    public void agregarObjeto(ObjetoInteligente objetoi) {

        for (int i = 0; i < objetos.size(); i++) {
            if (objetoi != null) {
                objetos.add(objetoi);
            }
        }
    }

    public void quitarObjeto(int id) {

        for (ObjetoInteligente objeto : objetos) {
            if (objeto != null && objeto.getId() == id) {
                objeto = null;
            }
        }
    }
    
    public boolean estaActivo(int id){   
        for (ObjetoInteligente objeto : objetos) {
            if (objeto.getEstado() == 1) {
                return true;
            }
        }
        return false;
    }
    
    
}
