package laboratorio.punto.pkg2;

import java.util.TreeMap;

/**
 * @author Juan Esteban Muñoz jemunozva@unal.edu.co / Mateo Pacheco -
 * cpachecof@unal.edu.co / Aldo Marquez - @unal.edu.co
 */
public class Inventario {

    private int cantidad;
    private Producto producto;
    private SubtotalVentas ventasDiarias;
    private TreeMap<String, Integer> inventariodeProductos= new TreeMap();
    
    public Inventario() {
        this.inventariodeProductos = new TreeMap();
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

    

    public void addProducto(String nombre, Integer cantidad) {
        inventariodeProductos.put(nombre, cantidad);
    }

    public void obtenerCantidad(Producto producto, Integer cantidad) {
        Integer cantidadActual = inventariodeProductos.get(producto.getNombre());
        Integer nuevaCantidad = cantidadActual - cantidad;

        inventariodeProductos.put(producto.getNombre(), nuevaCantidad);
    }
    public void obtenerCantidadPedido(Producto producto, Integer cantidad) {
        
        int cantidadActual = this.inventariodeProductos.get(producto.getNombre());
        int nuevaCantidad = cantidadActual + cantidad;

        inventariodeProductos.put(producto.getNombre(), nuevaCantidad);
    }

    public void avisoProducto(int cantidad) {
        if (cantidad == 0) {
            System.out.println("Este producto se encuentra agotado");
        }
    }

}
