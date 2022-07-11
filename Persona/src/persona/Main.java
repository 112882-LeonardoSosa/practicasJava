
package persona;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Persona[] personas = new Persona[3];
        
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Ingrese el nombre: ");
            String nombre = sc.next();
            System.out.println("Ingrese la edad: ");
            int edad = sc.nextInt();
            
            personas [i] = new Persona(nombre,edad);
            
            
        }
        
        //PROMEDIO DE LAS EDADES
        int acumulador =0;
        
        for (int i = 0; i < personas.length; i++) {
            acumulador+= personas[i].getEdad();
            
        }
        
        double promedio = (double)acumulador / personas.length;
        
        System.out.println("El promedio de las edades es: " + promedio);
    }
    
}
