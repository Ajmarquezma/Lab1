package laboratorio.punto.pkg2;

/**
 *
 * @author Juan Esteban Muñoz
 */
public class Tienda {
    
    private String nombreTienda;
    private String nombreDueño;
    private PedidoProveedor pedidoProveedor;
    private Producto producto;
    private Inventario inventario;
    private Empleado empleado;
    private VentasMensuales ventasMensuales;
    private Contabilidad contabilidad;
    private VentasDiarias ventasDiarias;

    public Tienda(String nombreTienda, String nombreDueño) {
        this.nombreTienda = nombreTienda;
        this.nombreDueño = nombreDueño;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public PedidoProveedor getPedidoProveedor() {
        return pedidoProveedor;
    }

    public Producto getProducto() {
        return producto;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public VentasMensuales getVentasMensuales() {
        return ventasMensuales;
    }

    public Contabilidad getContabilidad() {
        return contabilidad;
    }

    public VentasDiarias getVentasDiarias() {
        return ventasDiarias;
    }
   
    
    
}

