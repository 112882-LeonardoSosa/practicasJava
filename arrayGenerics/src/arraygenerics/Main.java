
package arraygenerics;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        ArrayList<Persona> listaPersonas = new ArrayList<>();

        int ingresa = 1;

        while (ingresa == 1) {
            System.out.println("Ingrese el Doc del Cliente: ");
            String documento = sc.next();
            System.out.println("Ingrese Nombre del Cliente: ");
            String nombre = sc.next();
            System.out.println("Ingrese edad del cliente: ");
            int edad = sc.nextInt();

            listaPersonas.add(new Persona(documento, nombre, edad));

            System.out.println("Desea ingresar otra persona? (1: Si / 0: No)");
            ingresa = sc.nextInt();

        }
        
        int acumulador = 0;

        for (Persona p : listaPersonas) {
            acumulador += p.getEdad();
        }
        
        float promedio = (float)acumulador / listaPersonas.size();
        
        System.out.println("Promedio de edades: " + promedio);
        
    }
    
}
