/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimerosPasos;

/**
 *
 * @author leos_
 */
//Desarrollar una clase llamada Password que siga las siguientes condiciones: 
//Que tenga los atributos longitud y contraseña. Por defecto, la longitud sera de 8. 
//Los constructores serán los siguiente: 
//Un constructor por defecto. 
//Un constructor con la longitud que nosotros le pasemos. Generará una contraseña aleatoria con esa longitud. 
//Los métodos que implementa serán: 
//esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener mas de 2 mayúsculas, mas de 1 minúscula y mas de 5 números. 
//generarPassword(): genera la contraseña del objeto con la longitud que tenga. 
//Método get para contraseña y longitud. 
//Método set para longitud.

public class Password {
    
    private int longitud;
    private String contrasenia;

    public Password() {
        longitud = 8;
        //contrasenia = generar una contraseña de 8 caracteres
        contrasenia = this.generarClave(8);
    }
    

    public Password(int longitud, String contrasenia) {
        this.longitud = longitud;
        //contrasenia = generar una contraseña de 8 caracteres de longitud
        contrasenia = this.generarClave(longitud);
    }
    
    private String generarClave(int longitud){
        
        String caracteres = "abcdefghijklmnopqrstuvxyz0123456789._";
        String contrasenia = "";
        
        for (int i = 0; i < longitud; i++) {
            int rand = (int)(Math.random() * caracteres.length());
            contrasenia += caracteres.charAt(rand);
        }
        
        return contrasenia;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

        
    
    
            
}
