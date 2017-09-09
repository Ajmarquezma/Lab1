package laboratorio.punto.pkg2;

/**
 *
 * @author Juan Esteban Muñoz
 */
public class Producto {

    private String nombre;
    private PedidoProveedor pedidoProveedor;
    private double precioCompraAProveedor;
    private double precioVenta;

    public Producto(String nombre, PedidoProveedor pedidoProveedor, double precioCompra, double precioVenta) {
        this.nombre = nombre;
        this.pedidoProveedor = pedidoProveedor;
        this.precioCompraAProveedor = precioCompra;
        this.precioVenta = precioVenta;
    }
    
     public Producto(String nombre, double precioVenta) {
        this.nombre = nombre;
        this.precioVenta = precioVenta;
    }

    public String getNombre() {
        return nombre;
    }

    public PedidoProveedor getPedidoProveedor() {
        return pedidoProveedor;
    }

    public double getPrecioCompraAProveedor() {
        return precioCompraAProveedor;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioCompraAProveedor(double precioCompraAProveedor) {
        this.precioCompraAProveedor = precioCompraAProveedor;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

}
