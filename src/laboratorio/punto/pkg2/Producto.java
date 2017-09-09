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
    private String tipoProducto;

    public Producto(String nombre, PedidoProveedor pedidoProveedor, double precioCompra, double precioVenta, String tipoProducto) {
        this.nombre = nombre;
        this.pedidoProveedor = pedidoProveedor;
        this.precioCompraAProveedor = precioCompra;
        this.precioVenta = precioVenta;
        this.tipoProducto = tipoProducto;
    }
    
     public Producto(String nombre, double precioVenta, String tipoProducto) {
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.tipoProducto = tipoProducto;
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

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

}
