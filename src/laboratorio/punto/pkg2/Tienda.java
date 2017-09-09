package laboratorio.punto.pkg2;

import java.util.ArrayList;

/**
 *
 * @author Juan Esteban Muñoz
 */
public class Tienda {
    
    private String nombreTienda;
    private String nombreDueño;
    private PedidoProveedor pedidoProveedor;
    private ArrayList<Producto> producto;
    private Inventario inventario;
    private ArrayList<Empleado> empleado;
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

    public ArrayList<Producto> getProducto() {
        return producto;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public ArrayList<Empleado> getEmpleado() {
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
   
    public void addEmpleado(Empleado empleado){
        this.empleado.add(empleado);
    }
    
    public void addProducto(Producto producto){
        this.producto.add(producto);
    }
    
    public String listaProductos(){
        String info = "";
        for(int i = 0; i < producto.size(); i++){
            info += "Nombre " + (i+1) + ":\n";
            info += "Precio: " + producto.get(i).getPrecioVenta()+ "\n";
        }
        return info;
    }
}

