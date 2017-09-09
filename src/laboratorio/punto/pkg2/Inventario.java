package laboratorio.punto.pkg2;

/**
 *
 * @author Juan Esteban Muñoz
 */
public class Inventario {
    
    private int cantidad;
    private Producto producto;
    private SubtotalVentas ventasDiarias;

    public Inventario(int cantidad, Producto producto, SubtotalVentas ventasDiarias) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.ventasDiarias = ventasDiarias;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public SubtotalVentas getVentasDiarias() {
        return ventasDiarias;
    }
    
    
}
