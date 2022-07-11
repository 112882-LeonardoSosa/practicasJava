
package cliente;


public class Ejecutable {


    public static void main(String[] args) {
        
        Cliente c1 = new Cliente(1,"Leo","3512643344");
        
        ClientePreferencial cp1 = new ClientePreferencial("Cochabamba", 353, 500, 2, "Messi", "35122");
        
        System.out.println(c1.toString());
        System.out.println(cp1.toString());
        
        
    }
    
}
