
package jalmacen.negocio;
import jalmacen.dominio.Venta;
import java.util.ArrayList;
import java.util.List;

public class GestorVentas {
    private List<Venta> ventas;
    
    //LAS LISTAS SON ESTRUCTURAS DINAMICAS, QUE PUEDEN CRECER EN LA EJECUCION DEL PROGRAMA
    public GestorVentas(){
        ventas = new ArrayList<>();
    }
    
    public boolean agregarVenta(Venta v){
        boolean avisoAdd = false;
        if (v != null) {
            
            avisoAdd = ventas.add(v);
            
        }
        
        return avisoAdd;      
    }
    
    
    public float[] totalVentasRubro(){
        float aux[] = new float[3];
        
        for (Venta v : ventas) {//FOR MEJORADO
            aux[v.getRubro()-1] += v.getPrecio(); //EN LA POSICION 0: RUBRO 1...
        }
        
        return aux;
    }
    
    public Venta obtenerMayorVenta(){
        Venta mayor = null;
        for (Venta venta : ventas) {
            if (mayor == null || venta.getPrecio()>mayor.getPrecio()) {
                mayor = venta;
            }
        }
               
        return mayor;
    }
    
    public float acumularVentasHasta(int dia){
        float aux = 0;
        for (Venta venta : ventas) {
            if (venta.getDia()<= dia && venta.getRubro() == 1) {
                aux += venta.getPrecio();
            }
        }
               
        return aux;
    }
    
}
