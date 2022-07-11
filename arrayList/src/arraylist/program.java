package arraylist;

import java.util.Scanner;
import java.util.ArrayList;

public class program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList listaClientes = new ArrayList();

        int ingresa = 1;

        while (ingresa == 1) {
            System.out.println("Ingrese el Id del Cliente: ");
            int idcliente = sc.nextInt();
            System.out.println("Ingrese Nombre del Cliente: ");
            String nombre = sc.next();
            System.out.println("Ingrese edad del cliente: ");
            int edad = sc.nextInt();

            listaClientes.add(new Cliente(idcliente, nombre, edad));

            System.out.println("Desea ingresar otra persona? (1: Si / 0: No)");
            ingresa = sc.nextInt();

        }
        
        int acumulador = 0;

        for (Object c : listaClientes) {
            Cliente c1 = (Cliente) c;
            acumulador += c1.getEdad();
        }
        
        float promedio = (float)acumulador / listaClientes.size();
        
        System.out.println("Promedio de edades: " + promedio);
    }

}
