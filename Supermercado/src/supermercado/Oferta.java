
package supermercado;


public class Oferta {
     
    private int nroProducto=0;
    private String nombreProducto="";
    private double precioRegular = 0;
    private double precioOferta = 0;
    private int cantVigencia = 0;
    private int stock = 0;

    public Oferta(int nroProducto, String nomProducto, double PrecioRegular, double precioOferta, int diasVigentes, int stock) {
        this.nroProducto = nroProducto;
        this.nombreProducto = nomProducto;
        this.precioRegular = PrecioRegular;
        this.precioOferta = precioOferta;
        this.cantVigencia = diasVigentes;
        this.stock = stock;
    }

    public int getNroProducto() {
        return nroProducto;
    }

    public void setNroProducto(int nroProducto) {
        this.nroProducto = nroProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioRegular() {
        return precioRegular;
    }

    public void setPrecioRegular(double precioRegular) {
        this.precioRegular = precioRegular;
    }

    public double getPrecioOferta() {
        return precioOferta;
    }

    public void setPrecioOferta(double precioOferta) {
        this.precioOferta = precioOferta;
    }

    public int getCantVigencia() {
        return cantVigencia;
    }

    public void setCantVigencia(int cantVigencia) {
        this.cantVigencia = cantVigencia;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
      
      
    @Override
    public String toString() {
        return "Oferta{" + "nroProducto=" + nroProducto + ", nombreProducto=" + nombreProducto + ", precioRegular=" + precioRegular + ", precioOferta=" + precioOferta + ", cantVigencia=" + cantVigencia + ", stock=" + stock + '}';
    }
      

    
    
    
    
}
