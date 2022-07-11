/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usoscanner;

public class Persona {

    private String Documento = "";
    private String Nombre = "";
    private String Apellido = "";

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getApellido() {
        return Apellido;
    }
    private int edad = 0;

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return Documento;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return edad;
    }

    
    public Persona(String documento, String nombre, String apellido, int edad){
        setDocumento(documento);
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        
    }
    
    @Override
    public String toString() {
        return "Persona{" + "Documento=" + Documento + ", Nombre Completo=" + Nombre + "" + Apellido + ", edad=" + edad + '}';
    }

    public boolean esMayorDeEdad() {
        if (edad >= 18) {
            return true;
        }
        else
            return false;
    }

    public int incrementarEdad() {
        return edad++;
    }

    public Persona(String nombre, int edad) {
        this.Nombre = nombre;
        this.edad = edad;
    }
    
    
    
}
