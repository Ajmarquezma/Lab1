package laboratorio.punto.pkg2;

/**
 *
 * @author Juan Esteban Muñoz
 */
public class PedidoProveedor {
    
    private String nombreProveedor;
    private double fechaLimiteAPagar;
    private String nombreProducto;
    private double precioVenta;
    private int cantidadProducto;

    public PedidoProveedor(String nombreProveedor, double fechaLimite, String nombreProducto, double precioVenta, int cantidadProducto) {
        this.nombreProveedor = nombreProveedor;
        this.fechaLimiteAPagar = fechaLimite;
        this.nombreProducto = nombreProducto;
        this.precioVenta = precioVenta;
        this.cantidadProducto = cantidadProducto;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public double getFechaLimiteAPagar() {
        return fechaLimiteAPagar;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }
    
    public double HacerPedido(double precioVenta, int cantidadProducto){
        double total_dinero_pedido;
        total_dinero_pedido = precioVenta * cantidadProducto;
        return total_dinero_pedido;
    }
    
}
