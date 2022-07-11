package PrimerosPasos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leos_
 */
public class Punto {
    
    private float x;
    private float y;

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    
    public Punto(){
    
    }
    
    public Punto(float x, float y){      
        this.x= x;
        this.y= y;      
//        setX(x);
//        setY(y);
    }
    
    public float calcularDistancia(Punto otro){
        
        float dx = this.x - otro.getX();
        float dy = this.y - otro.getY();
        
        return (float) Math.sqrt(dx * dx + dy* dy);
    }
    
}
