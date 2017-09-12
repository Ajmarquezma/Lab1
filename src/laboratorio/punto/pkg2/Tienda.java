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
            info += "Nombre " + (i + 1) + ":\n";
            info += "Precio: " + producto.get(i).getPrecioVenta() + "\n";
            info += "Tipo de Producto: " + producto.get(i).getTipoProducto() + ":\n";
        }
        return info;
        //System.out.println(info);
    }

    public String listaEmpleados() {
        String info = "";
        for (int i = 0; i < empleado.size(); i++) {
            info += "Info. Empleado" + (i + 1) + ":\n";
            info += "salario" + empleado.get(i).getSalario() + ":\n";
            info += "nombre: " + empleado.get(i).getNombre() + ":\n";
            info += "contrato: " + empleado.get(i).getContrato() + ":\n";
            info += "horaEntrada: " + empleado.get(i).getHoraEntrada() + ":\n";
            info += "horaSalida: " + empleado.get(i).getHoraSalida() + ":\n";
        }
        return info;
    }
}
