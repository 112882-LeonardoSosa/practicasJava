/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainClass;

public class claseEmpresa {

    public Empleado[] arrayEmpleados;
    
    int tamanioArray = 0;

    public int getTamanioArray() {
        return tamanioArray;
    }

    public void setTamanioArray(int tamanioArray) {
        this.tamanioArray = tamanioArray;
    }      
    
    public void agregarEmpleado(Empleado nuevo) {
        for (int i = 0; i < arrayEmpleados.length; i++) {
            if (arrayEmpleados[i] == null) {
                arrayEmpleados[i] = nuevo;
                break;
            }
        }
    }
    
    double horasNoTrabajadas = 0;

    public double totalHorasPerdidas() {

        for (int i = 0; i < arrayEmpleados.length; i++) {
            horasNoTrabajadas += arrayEmpleados[i].getCantMinutosTarde() / 60
                    + arrayEmpleados[i].getFaltas() * 8;
        }
        return horasNoTrabajadas;
    }

    public double promedioInasistencia() {
        int faltas = 0;
        int cantEmpleados = 0;
        for (int i = 0; i < arrayEmpleados.length; i++) {
            faltas += arrayEmpleados[i].getFaltas();
            cantEmpleados++;
        }

        if (cantEmpleados > 0) {
            return faltas / cantEmpleados;
        } else {
            return 0;
        }

        //return (cantEmpleados > 0) ? faltas / cantEmpleados : 0; //TERNARIO
    }

}
