package laboratorio.punto.pkg2;
import java.util.TreeMap;
/**
 * @author Juan Esteban Muñoz jemunozva@unal.edu.co / Mateo Pacheco - cpachecof@unal.edu.co / Aldo Marquez - @unal.edu.co
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
    
    TreeMap <String, Integer> inventariodeProductos = new TreeMap<>();
       inventariodeProductos.put("Jabón", 35);
    
    public int obtenerCantidad( Producto producto, int cantidad ){
        
        if (this.producto == ventasDiarias.getProducto()){
        this.cantidad = cantidad - cantidad
        return cantidad;
        }
    }
        
    
    public void avisoProducto (int cantidad ){
        if (cantidad == 0){
            System.out.println("Este producto se encuentra agotado");
        }        
        return null;
    }

    
    
}
