package laboratorio.punto.pkg2;

import java.util.*;

/**
 *
 * @author Juan Esteban Muñoz
 */
public class Contabilidad {

    private PedidoProveedor pedidoProveedor;
    private ArrayList<Venta> Ventas;
    private TreeMap<String,Empleado> empleados;
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

    public TreeMap<String, Empleado> getEmpleados() {
        return empleados;
    }

 

    public double getGananciasDiarias() {
        return GananciasDiarias;
    }

    public double getGananciasMensuales() {
        return GananciasMensuales;
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
    public void consultarSalarioEmpleado(String nombre){
       Empleado empleado = empleados.get(nombre);
       empleado.getValorPagoTotal();
    }

}
