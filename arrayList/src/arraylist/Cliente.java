
package arraylist;

import java.util.ArrayList;


public class Cliente extends Persona{
    
    private int idCliente;
    ArrayList<Cliente> clientes = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(int idCliente, String nombre, int edad) {
        super(nombre, edad);
        this.idCliente = idCliente;
    }
    
    @Override
    public String toString() {
        return super.toString() + "id Cliente: " + idCliente; 
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    
    
    public void agregarCliente(Cliente cliente){
        
        for (int i = 0; i < 10; i++) {
            clientes.add(cliente);
        }
    }
    
    
}
