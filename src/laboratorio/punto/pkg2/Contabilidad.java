package laboratorio.punto.pkg2;

import java.util.*;

/**
 *
 * @author Juan Esteban Muñoz
 */
public class Contabilidad {

    private PedidoProveedor pedidoProveedor;
    private ArrayList<Venta> Ventas;
    private Empleado empleado;
    private double GananciasDiarias;
    private double GananciasMensuales;

    public PedidoProveedor getPedidoProveedor() {
        return pedidoProveedor;
    }

    public ArrayList<Venta> getVentas() {
        return Ventas;
    }

    public void addVentas(Venta venta) {
        Ventas.add(venta);
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public double getGananciasDiarias() {
        return GananciasDiarias;
    }

    public double getGananciasMensuales() {
        return GananciasMensuales;
    }

    public void ventasDiarias(int Dia, ArrayList<Venta> Ventas) {
        for (Venta v : Ventas) {
            if (Dia == v.getFecha().getDia()) {
                System.out.println(v);
            } else {
            }
        }

    }

    public void ventasMensuales(int Mes, ArrayList<Venta> Ventas) {
        for (Venta v : Ventas) {
            if (Mes == v.getFecha().getMes()) {
                System.out.println(v);
            } else {
            }
        }

    }
}
