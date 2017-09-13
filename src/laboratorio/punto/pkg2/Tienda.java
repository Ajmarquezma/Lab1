package laboratorio.punto.pkg2;
import java.util.ArrayList;
/**
 * @Autores: Juan Esteban Muñoz jemunozva@unal.edu.co / Mateo Pacheco - cpachecof@unal.edu.co / Aldo Marquez - ajmarquezma@unal.edu.co
 */
public class Tienda {

    private String nombreTienda;
    private String nombreDueño;
    private ArrayList<PedidoProveedor> pedidoProveedor;
    private ArrayList<Producto> producto;
    private Inventario inventario;
    private ArrayList<Empleado> empleado;
    private Contabilidad contabilidad;

    public Tienda(String nombreTienda, String nombreDueño) {
        this.nombreTienda = nombreTienda;
        this.nombreDueño = nombreDueño;
        this.empleado = new ArrayList();
        this.producto = new ArrayList();
        this.pedidoProveedor = new ArrayList();
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public ArrayList<PedidoProveedor> getPedidoProveedor() {
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

    public Contabilidad getContabilidad() {
        return contabilidad;
    }

    public void addEmpleado(Empleado empleado) {
        this.empleado.add(empleado);
    }

    public void addProducto(Producto producto) {
        this.producto.add(producto);
    }

    public String listaProductos() {
        String info = "";
        for (int i = 0; i < producto.size(); i++) {
            info += "Info. Producto " + (i + 1) + "\n";
            info += "Nombre: " + producto.get(i).getNombre() + "\n";
            info += "Precio: $" + producto.get(i).getPrecioVenta() + "\n";
            info += "Tipo de Producto: " + producto.get(i).getTipoProducto() + "\n";
            info += "\n";
        }
        return info;
           }

    public String listaEmpleados() {
        String info = "";
        for (int i = 0; i < empleado.size(); i++) {
            info += "Info. Empleado" + (i + 1) + "\n";
            info += "Salario: $" + empleado.get(i).getSalario() + "\n";
            info += "Nombre: " + empleado.get(i).getNombre() + "\n";
            info += "Contrato: " + empleado.get(i).getContrato() + " meses" + "\n";
            info += "Hora de Entrada: " + empleado.get(i).getHoraEntrada() + "\n";
            info += "Hora de Salida: " + empleado.get(i).getHoraSalida() + "\n";
            info +="\n";
        }
        return info;
    }
}
