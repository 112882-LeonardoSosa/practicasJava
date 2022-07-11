/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usoscanner;

import java.util.Scanner;
import java.util.Set;

public class UsoScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Ingrese un numero");
//        int num1 = sc.nextInt();
//        System.out.println("Ingrese otro numero");
//        int num2 = sc.nextInt();
//
//        int suma = num1 + num2;
//        int multi = num1 * num2;
//        double div = (double)num1 / num2;
//
//        System.out.println("Suma: " + suma);
//        System.out.println("Multiplicacion: " + multi);
//        System.out.printf("Division: %.2f\n", div);
//        Persona p2 = new Persona("22", "Leo", "Sosa", 0);
//        Persona p1 = new Persona();
//        
//        System.out.println(p2.toString());
//        System.out.println("Ingrese su Nombre: ");
//        p1.setNombre(sc.nextLine());
//        System.out.println("Ingrese su Apellido: ");
//        p1.setApellido(sc.nextLine());
//        System.out.println("Ingrese su Documento: ");
//        p1.setDocumento(sc.nextLine());
//        System.out.println("Ingrese su Edad: ");
//        p1.setEdad(sc.nextInt());
//        
//        
//        System.out.println("Datos de la Persona: " + p1.toString());
//        System.out.println("Es mayor de edad: "+p1.esMayorDeEdad());
//        System.out.println(p1.incrementarEdad());
//        int[] arrayNumeros;
//        System.out.println("Ingrese la cantidad de numeros a cargar: ");
//        int cantidad = sc.nextInt();
//        arrayNumeros = new int[cantidad];
//
//        for (int i = 0; i < arrayNumeros.length; i++) {
//            System.out.println("Ingrese un numero: ");
//            arrayNumeros[i] = sc.nextInt();
//        }
//        //SUMATORIA DE LOS NUMEROS
//        int acumulador = 0;
//        for (int i = 0; i < arrayNumeros.length; i++) {
//            acumulador += arrayNumeros[i];
//        }
//        
//        //PROMEDIO DE TODOS LOS NUMEROS 
//        float promedio = (float)acumulador / arrayNumeros.length;
//        
//        //OBTENER MULTIPLICOS DE 5
//        boolean existeMultiplo=false;
//        
//        for (int i = 0; i < arrayNumeros.length; i++) {
//            if (arrayNumeros[i] % 5 == 0)//SI ES MULTIPLICO DE 5
//            {
//                existeMultiplo = true;
//            }
//        }
//        
//        //RESULTADOS
//        System.out.println("Sumatoria: " + acumulador);
//        System.out.println("Promedio: " + promedio);
//        if (existeMultiplo) {
//            System.out.println("Existen multiplos de 5");
//        }
//        else
//            System.out.println("No existen multiplos de 5");
        Persona[] arrayPersonas;
        arrayPersonas = new Persona[3];
        arrayPersonas[0] = new Persona("Leo", 25);
        arrayPersonas[0] = new Persona("Enzo", 33);
        arrayPersonas[0] = new Persona("Roman", 17);

        float promedio = 0;
        int sumaEdades = 0;
        for (int i = 0; i < arrayPersonas.length; i++) {
            System.out.println("Ingrese Nombre de la persona: ");
            String nombre = sc.next();
            System.out.println("Ingrese Edad: ");
            int edad = sc.nextInt();

            arrayPersonas[i] = new Persona(nombre, edad);

        }
        //PROMEDIO DE LAS EDADES
        for (int i = 0; i < arrayPersonas.length; i++) {
            sumaEdades += arrayPersonas[i].getEdad();
        }
        promedio = (float) sumaEdades / arrayPersonas.length;
        
        System.out.println("El promedio de las edades es: " + promedio);
    }

}
