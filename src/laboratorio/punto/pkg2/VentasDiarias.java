package laboratorio.punto.pkg2;

/**
 *
 * @author Juan Esteban Muñoz
 */
public class VentasDiarias {
    
    private Producto producto;
    private Inventario inventario;
    private int cantidadProducto;

    public VentasDiarias(Producto producto, Inventario inventario, int cantidadProducto) {
        this.producto = producto;
        this.inventario = inventario;
        this.cantidadProducto = cantidadProducto;
    }

    public Producto getProducto() {
        return producto;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }
    
    
}
