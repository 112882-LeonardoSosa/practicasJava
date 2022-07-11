package supermercado;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Fecha de Inicio: ");
        String fecha = sc.next();
        System.out.println("Ingrese Cantidad de Ofertas a cargar: ");
        int cant = sc.nextInt();

        Folleto f1 = new Folleto(fecha, cant);

        for (int i = 0; i < cant; i++) {
            System.out.println("Nro Producto: ");
            int nro = sc.nextInt();
            System.out.println("Nombre Producto: ");
            String nombre = sc.next();
            System.out.println("Precio Regular: ");
            double pr = sc.nextDouble();
            System.out.println("Precio Oferta: ");
            double po = sc.nextDouble();
            System.out.println("Cantidad de dias en Vigencia: ");
            int dias = sc.nextInt();
            System.out.println("Stock: ");
            int stock = sc.nextInt();
            
            Oferta o1 = new Oferta(nro,nombre,pr,po,dias,stock);
            f1.agregarOferta(o1);
        }
        
        System.out.println("codigo de articulo a comparar");
        int codigo = sc.nextInt();
        
        System.out.println("Cantidad de articulos por mas de 5 dias: "+f1.cantArticulos());
        System.out.println("Total de unidades que hay a la venta: "+f1.totalStock());
        System.out.println("Cantidad de articulos ofrecidos con descuento superior a $20: "+f1.artDescuento());
        System.out.println("Total a recaudar por x articulos"+f1.totalRecaudado(codigo));
        
    }

}
