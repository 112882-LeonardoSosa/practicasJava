
package jalmacen;

import jalmacen.dominio.Venta;
import jalmacen.negocio.GestorVentas;


public class Ejecutable {


    public static void main(String[] args) {
        
        GestorVentas gestor = new GestorVentas();
        
        gestor.agregarVenta(new Venta("Acme",1900,12,1));
        gestor.agregarVenta(new Venta("Adidas",1700,12,1));
        gestor.agregarVenta(new Venta("Nike",1300,12,1));
        
        System.out.println("Total de Ventas de c/Rubro: \n");
        float[] totales = gestor.totalVentasRubro();
        for (int i = 0; i < totales.length; i++) {
            System.out.println("Total rubro ["+ (i+1) +"]" + totales[i]);
        }
        
        
    }
    
}
