
package figurasgeometricas;


public class Circulo extends Figura{
    
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    @Override
    public float superficie(){
        
        return (float)Math.PI * radio * radio;
    }
}
