package MainClass;

import java.util.Scanner;

public class Empresa {

    public static void main(String[] args) {

        
        double acumulador = 0;
        Scanner sc = new Scanner(System.in);
        claseEmpresa e = new claseEmpresa();

       

            System.out.println("Ingrese legajo del empleado: ");
            int legajo = sc.nextInt();
            System.out.println("Ingrese Cantidad de Faltas: ");
            int cantFaltas = sc.nextInt();
            System.out.println("Ingrese Cantidad de Minutos tarde: ");
            double cantMinutos = sc.nextDouble();

            Empleado empl = new Empleado(legajo, cantFaltas, cantMinutos);
            
            e.agregarEmpleado(empl);

        
        
        System.out.println("Total de horas Perdidas: " + e.totalHorasPerdidas());
        System.out.println("Promedio Inasistencias: " + e.promedioInasistencia());

    }
}
