
package forms;

import java.util.ArrayList;
import java.util.List;


public class Deposito {
    
    private List<Articulo> articulos;

    public Deposito() {
        
        articulos = new ArrayList<>();
    }
    
    
    public void agregarArticulo(Articulo articulo){
        if (articulo != null) {
            articulos.add(articulo);
        }
    }
    
    
//    public Object[] obtenerTodos(){
//        
//    }
    
    
}
