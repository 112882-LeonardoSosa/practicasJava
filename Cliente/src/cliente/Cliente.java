package cliente;

public class Cliente {

    protected int nroCliente;
    protected String nombre;
    protected String telefono;

    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Cliente(int nroCliente, String nombre, String telefono) {
        this.nroCliente = nroCliente;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Cliente() {

    }

    @Override
    public String toString() {
        return "Cliente{" + "nroCliente=" + nroCliente + ", nombre=" + nombre + ", telefono=" + telefono + '}';
    }

}
