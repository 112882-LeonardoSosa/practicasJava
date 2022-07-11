package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<Reserva> reservas;

    public Hotel() {
        reservas = new ArrayList<>();
    }

    public void addReserva(Reserva r) {
        if (r != null) {
            reservas.add(r);
        }
    }

    public float totalFacturacion() {
        float total = 0;
        for (Reserva reserva : reservas) {
            total += reserva.getDiasReservados() * reserva.getTarifaDiaria()
                    + reserva.getCantidadNinios() * reserva.getTarifaNinio();
        }
        return total;
    }

    //CANTIDAD DE RESERVAS DE CADA TIPO
    public String cantidadReservas() {
        int contadorNegocios = 0;
        int contadorConferencia = 0;
        int contadorVacaciones = 0;
        for (Reserva reserva : reservas) {
            if (reserva.getTipoReserva() == "Negocios") {
                contadorNegocios++;
            }
            
            if (reserva.getTipoReserva()=="Conferencia") {
                contadorConferencia++;
            }
            if (reserva.getTipoReserva() == "Vacaciones") {
                contadorVacaciones++;
            }
        }
              
        return "Cantidad de Reservas tipo Negocio: " + contadorNegocios 
                + "\nCantidad Reservas tipo Conferencia: " + contadorConferencia
                + "\nCantidad Reservas tipo Vacaciones: " + contadorVacaciones;
    }
     public Reserva[] obtenerTodos() {

        return reservas.toArray(new Reserva[reservas.size()]);

    }
    
}
