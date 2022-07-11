package entidades;

import java.util.ArrayList;

public class Clinica {

    private ArrayList<Paciente> pacientes;

    public Clinica() {
        pacientes = new ArrayList<>();
    }

    public void addPaciente(Paciente paciente) {
        if (paciente != null) {
            pacientes.add(paciente);
        }
    }

    public ArrayList<Paciente> obtenerTodos() {
        return pacientes;
    }

    public void eliminarPaciente(int indice) {

        pacientes.remove(indice);
    }

    public double montoTotalxPaciente() {

        double total = 0;
        for (Paciente paciente : pacientes) {
            total = paciente.montoTotal();
        }
        return total;
    }

    public String pacienteMayor() {
        Paciente mayor = pacientes.get(0);
        String pacienteMayor = "";

        for (Paciente paciente : pacientes) {
            if (mayor.getEdad() > paciente.getEdad()) {
                pacienteMayor = mayor.getNombreCompleto();
                return pacienteMayor;

            } else {
                pacienteMayor = paciente.getNombreCompleto();
                return pacienteMayor;
            }
        }
        return pacienteMayor;
    }
    
    public int cantidadSesiones(){
        int cantidad = 0;
        for (Paciente paciente : pacientes) {
            if (paciente.isObraSocial()==false) {
                cantidad++;
            }
        }
        return cantidad;
    }
}
