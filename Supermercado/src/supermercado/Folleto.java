package supermercado;

public class Folleto {

    String fechaInicio = "";
    Oferta[] ofertas;

    public Folleto(String fecha, int cantidad) {
        this.fechaInicio = fecha;
        this.ofertas = new Oferta[cantidad];

    }

    public void agregarOferta(Oferta nuevo) {
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i] == null) {
                ofertas[i] = nuevo;
                break;
            }
        }
    }

    //CANTIDAD DE ARTICULOS OFERTADOS + 5 DIAS
    public int cantArticulos() {
        int acumulador = 0;

        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i].getCantVigencia() > 5) {
                acumulador++;
            }
        }
        return acumulador;

    }

    //TOTAL STOCK
    public int totalStock() {
        int acumulador = 0;
        for (int i = 0; i < ofertas.length; i++) {
            acumulador += ofertas[i].getStock();
        }
        return acumulador;
    }

    //Cantidad de artículos ofrecidos con un descuento superior a $20.
    public int artDescuento() {
        int acumulador = 0;
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i].getPrecioRegular() - ofertas[i].getPrecioOferta() > 20) {
                acumulador++;
            }
        }
        return acumulador;
    }

    //4. Total a recaudar por un artículo en particular indicado por su código, suponiendo que se vendan todas
    //las unidades disponibles
    public double totalRecaudado(int codigo) {
        double total = 0;
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i] != null) {
                if (ofertas[i].getNroProducto() == codigo) {
                    total += ofertas[i].getStock() * ofertas[i].getPrecioOferta();
                }
            }
        }
        return total;
    }
    
    
    
}
