/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author leos_
 */
public class Triangulo extends Figura{
    
    private float base;
    private float altura;
    
    @Override
    public float superficie(){
        return base * altura / 2f;
    }
}
