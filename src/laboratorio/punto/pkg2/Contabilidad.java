package laboratorio.punto.pkg2;
import java.util.*;
/**
 * @Autores: Juan Esteban Muñoz jemunozva@unal.edu.co / Mateo Pacheco - cpachecof@unal.edu.co / Aldo Marquez - ajmarquezma@unal.edu.co
 */
public class Contabilidad {

    private PedidoProveedor pedidoProveedor;
    private ArrayList<Venta> Ventas;
    private TreeMap<String,Empleado> empleados;
    
    public Contabilidad() {
        this.empleados = new TreeMap();
    }
    
    
    public PedidoProveedor getPedidoProveedor() {
        return pedidoProveedor;
    }

    public ArrayList<Venta> getVentas() {
        return Ventas;
    }

    public void addVentas(Venta venta) {
        Ventas.add(venta);
    }

 
    public TreeMap<String, Empleado> getEmpleados() {
        return empleados;
    }

    public void addEmpleados(String nombre, Empleado empleado){
        empleados.put(nombre, empleado);
    }
    public void getEmpleados(String nombre){
        System.out.println(empleados.get(nombre)); 
    }
    public void mostrarVentasDiarias(int Dia,int Mes, int Año) {
        for (Venta v : Ventas) {
            if ((Dia == v.getFecha().getDia())&&(Mes == v.getFecha().getMes())&&(Año == v.getFecha().getAño())) {
                System.out.println(v);
            } else {
            }
        }

    }
    
     public double valorVentasDiarias(int Dia,int Mes, int Año) {
         double valor = 0;
        for (Venta v : Ventas) {
            if ((Dia == v.getFecha().getDia())&&(Mes == v.getFecha().getMes())&&(Año == v.getFecha().getAño())) {
                valor+= v.getTotal();
            } else {
            }
        }
        return valor;
    }

    public void mostrarVentasMensuales(int Mes, int Año) {
        for (Venta v : Ventas) {
            if (Mes == v.getFecha().getMes()&&(Año == v.getFecha().getAño())) {
                System.out.println(v);
            } else {
            }
        }

    }
    public double valorVentasMensuales(int Mes, int Año) {
        double valor = 0;
        for (Venta v : Ventas) {
            if (Mes == v.getFecha().getMes()&&(Año == v.getFecha().getAño())) {
                valor+= v.getTotal();
            } else {
            }
        }

        
        return valor;
    }
    public double consultarSalarioEmpleado(String nombre){
       Empleado empleado = empleados.get(nombre);
        System.out.println(empleado.getValorPagoTotal());
       return empleado.getValorPagoTotal();
    }

}
