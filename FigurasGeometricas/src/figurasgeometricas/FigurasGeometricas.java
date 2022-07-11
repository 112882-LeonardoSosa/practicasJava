package figurasgeometricas;

import java.util.ArrayList;
import java.util.Scanner;

public class FigurasGeometricas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Figura> figuras = new ArrayList<>();

        
        int cantidad;
        System.out.println("Ingrese la cantidad de figuras a ingresar: ");
        cantidad = sc.nextInt();
        
        for (int i = 0; i < cantidad; i++) {
            int tipoFigura;
            
            System.out.println("Ingrese el tipo de figura: (1: Circulo, 2: Rectangulo, 3: Triangulo) : ");
            tipoFigura = sc.nextInt();
            
            Figura nueva = null;
            
            switch (tipoFigura) {
                case 1:
                    System.out.println("Ingrese el radio: ");
                    float radio = sc.nextFloat();
                    nueva = new Circulo(radio);
                    System.out.println("Superficie: " + nueva.superficie());
                    break;
                case 2:
                    System.out.println("Ingrese la base: ");
                    float base1 = sc.nextFloat();
                    System.out.println("Ingrese la altura: ");
                    float altura1 = sc.nextFloat();
                    nueva = new Rectangulo(base1,altura1);
                    System.out.println("Superficie: " + nueva.superficie());
                    break;
                case 3:
                    System.out.println("Ingrese la base: ");
                    float base2 = sc.nextFloat();
                    System.out.println("Ingrese la altura: ");
                    float altura2 = sc.nextFloat();
                    nueva = new Triangulo(base2,altura2);
                    System.out.println("Superficie: " + nueva.superficie());
                    break;                          
            }
            
            if (nueva != null) {
                figuras.add(nueva);
            }
            
            float suma = 0;
            
            for (Figura f : figuras) {
                suma += f.superficie();//LLAMA POLIMORFICA, POR CADA LLAMADA DE DISTINTOS OBJETOS
                //TIENE UN COMPORTAMIENTO DISTINTO
            }
            
            
                                 
        }
        
        
        
    }

}
