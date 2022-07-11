/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente;

/**
 *
 * @author leos_
 */
public class ClientePreferencial extends Cliente {
    
    private String domicilio;
    private float saldo;
    private float saldoMaximo;

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldoMaximo() {
        return saldoMaximo;
    }

    public void setSaldoMaximo(float saldoMaximo) {
        this.saldoMaximo = saldoMaximo;
    }

    
    public ClientePreferencial() {
    }

    public ClientePreferencial(String domicilio, float saldo, float saldoMaximo, int nroCliente, String nombre, String telefono) {
        super(nroCliente, nombre, telefono);
        this.domicilio = domicilio;
        this.saldo = saldo;
        this.saldoMaximo = saldoMaximo;
    }
    
    
    @Override
    public String toString() {
        return super.toString()+"ClientePreferencial{" + "domicilio=" + domicilio + ", saldo=" + saldo + ", saldoMaximo=" + saldoMaximo + '}';
    }
    
    
}
