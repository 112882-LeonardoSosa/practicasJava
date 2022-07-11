package entidades;

import java.util.ArrayList;
import java.util.List;

public class Clinica {

    private List<Paciente> pacientes;

    public Clinica() {//CONSTRUCTOR SIN PARAMETROS QUE INICIALIZA LA LISTA
        pacientes = new ArrayList<>();
    }

    public void addPaciente(Paciente p) {//AGREGAR

        if (p != null) {
            pacientes.add(p);
        }
    }

    public Paciente[] obtenerTodos() {
        return pacientes.toArray(new Paciente[pacientes.size()]);
    }

    public float calcularMontoTotal() {//MONTO TOTAL POR PACIENTE
        int montoTotal = 0;
        for (Paciente paciente : pacientes) {
            montoTotal += paciente.calcularMontoSesiones();
        }
        return montoTotal;
    }

    public int cantidadSesionesSinOS() {//CANTIDAD DE SESIONES PARA PACIENTES SIN OBRA SOCIAL
        int cantidad = 0;
        for (Paciente paciente : pacientes) {
            if (paciente.isObraSocial() == false) {
                cantidad += paciente.getSesiones();//acumular
            }
        }
        return cantidad;
    }

    public String pacienteMayor() {//DEVUELVE EL PACIENTE DE MAYOR EDAD
        Paciente mayor = pacientes.get(0);

        for (Paciente paciente : pacientes) {
            if (mayor.getEdad() < paciente.getEdad()) {
                mayor = paciente;

            }
        }
        
        return mayor.getNombreCompleto();
    }

    public Paciente obtenerPacienteMayorEdad(){//DEVUELVE EL PACIENTE DE MAYOR EDAD COMO OBJETO
        Paciente pteMayor = pacientes.get(0);
        
        for (int i = 1; i < pacientes.size(); i++) {
            
            if (pacientes.get(i).getEdad() > pteMayor.getEdad()) {
                pteMayor = pacientes.get(i);
            }
        }
        
        return pteMayor;
        
    }
    
    
    
}
