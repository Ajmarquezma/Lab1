package laboratorio.punto.pkg2;

/**
 *
 * @author Juan Esteban Muñoz
 */
public class SubtotalVentas {

    private Producto producto;
    private int cantidadProducto;

    public SubtotalVentas(Producto producto, int cantidadProducto) {
        this.producto = producto;
        this.cantidadProducto = cantidadProducto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public double getSubTotal() {
        double total;
        total = this.getCantidadProducto() * this.producto.getPrecioVenta();
        return total;
    }

    ;

    @Override
    public String toString() {
        return "SubtotalVentas: " + '\n' + "producto: " + producto + '\n' + "cantidadProducto: " + cantidadProducto + '\n' + "Subtotal: " + getSubTotal();
    }

}
