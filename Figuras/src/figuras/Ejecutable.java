package figuras;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Figura> figuras = new ArrayList<>();

        int cantidad;

        System.out.println("Ingrese la cantidad de figuras a ingresar: ");
        cantidad = sc.nextInt();

        for (int i = 0; i < cantidad; i++) {
            int tipo;
            System.out.println("Ingrese el tipo de la figura (1: Circulo, 2: Rectangulo, 3: Triangulo): ");
            tipo = sc.nextInt();

            Figura nueva = null;

            //CONDICIONAL MULTIPLE
            switch (tipo) {
                case 1:
                    nueva = new Circulo();
                    break;
                case 2:
                    nueva = new Rectangulo();
                    break;
                case 3:
                    nueva = new Triangulo();
                    break;
            }

            if (nueva != null) {

                figuras.add(nueva);
            }

        }

    }

}
