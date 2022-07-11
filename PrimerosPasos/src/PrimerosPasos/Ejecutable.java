/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PrimerosPasos;

/* @author leos_
 */
public class Ejecutable {


    public static void main(String[] args) {
        
        Punto a, b;
        
        a = new Punto();
        
        a.setX(4);
        a.setY(3);
        
        b = new Punto();
        
        b.setX(5);
        b.setY(8);
        
        System.out.println(a.getX() +"," + a.getY());
        System.out.println(b.getX() +"," + b.getY());
        
        System.out.println("Distancia entre a y b: " + a.calcularDistancia(b));
    }
    
}
