package laboratorio.punto.pkg2;

import java.util.*;

/**
 * @Autores: Juan Esteban Muñoz jemunozva@unal.edu.co / Mateo Pacheco -
 * cpachecof@unal.edu.co / Aldo Marquez - ajmarquezma@unal.edu.co
 */
public class Contabilidad {

    private ArrayList<Venta> Ventas;
    private ArrayList<PedidoProveedor> pedidos;
    private TreeMap<String, Empleado> empleados;

    public Contabilidad() {
        this.empleados = new TreeMap();
        this.Ventas = new ArrayList();
        this.Ventas = new ArrayList();
    }


    public ArrayList<Venta> getVentas() {
        return Ventas;
    }

    public void addVentas(Venta venta) {
        Ventas.add(venta);
    }
    public void addPedidos(PedidoProveedor pedido) {
        pedidos.add(pedido);
    }

    public TreeMap<String, Empleado> getEmpleados() {
        return empleados;
    }

    public void addEmpleados(String nombre, Empleado empleado) {
        empleados.put(nombre, empleado);
    }

    public void getEmpleados(String nombre) {
        System.out.println(empleados.get(nombre));
    }

    public void mostrarVentasDiarias(int Dia, int Mes, int Año) {
        for (Venta v : Ventas) {
            if ((Dia == v.getFecha().getDia()) && (Mes == v.getFecha().getMes()) && (Año == v.getFecha().getAño())) {
                System.out.println(v);
            } else {
                System.out.println("Este día no se han realizado ventas");
            }
        }

    }

    public double valorVentasDiarias(int Dia, int Mes, int Año) {
        double valor = 0;
        for (Venta v : Ventas) {
            if ((Dia == v.getFecha().getDia()) && (Mes == v.getFecha().getMes()) && (Año == v.getFecha().getAño())) {
                valor += v.getTotal();
            } else {
            }
        }
        return valor;
    }

    public void mostrarVentasMensuales(int Mes, int Año) {
        for (Venta v : Ventas) {
            if (Mes == v.getFecha().getMes() && (Año == v.getFecha().getAño())) {
                System.out.println(v);
            } else {
                System.out.println("Este mes no se han realizado ventas");
            }
        }

    }

    public double valorVentasMensuales(int Mes, int Año) {
        double valor = 0;
        for (Venta v : Ventas) {
            if (Mes == v.getFecha().getMes() && (Año == v.getFecha().getAño())) {
                valor += v.getTotal();
            } else {
            }
        }

        return valor;
    }

    public double consultarSalarioEmpleado(String nombre) {
        Empleado empleado = empleados.get(nombre);
        System.out.println(empleado.getValorPagoTotal());
        return empleado.getValorPagoTotal();
    }

    
    public void mostrarPagosDiarios(int Dia, int Mes, int Año) {
        for (PedidoProveedor v : pedidos) {
            if ((Dia == v.getFecha().getDia()) && (Mes == v.getFecha().getMes()) && (Año == v.getFecha().getAño())) {
                System.out.println(v);
            } else {
            }
        }

    }

    public double valorPagosDiarios(int Dia, int Mes, int Año) {
        double valor = 0;
        for (PedidoProveedor v : pedidos) {
            if ((Dia == v.getFecha().getDia()) && (Mes == v.getFecha().getMes()) && (Año == v.getFecha().getAño())) {
                valor += v.getTotal();
            } else {
            }
        }
        return valor;
    }

    public void mostrarPagosMensuales(int Mes, int Año) {
        for (PedidoProveedor v : pedidos) {
            if (Mes == v.getFecha().getMes() && (Año == v.getFecha().getAño())) {
                System.out.println(v);
            } else {
            }
        }

    }

    public double valorPagosMensuales(int Mes, int Año) {
        double valor = 0;
        for (PedidoProveedor v : pedidos) {
            if (Mes == v.getFecha().getMes() && (Año == v.getFecha().getAño())) {
                valor += v.getTotal();
            } else {
            }
        }
        
        return valor;
    }
    
    public double ingresosDiarios(int dia, int mes, int año){
        double ingresos = 0;
        double ventas = valorPagosDiarios(dia,mes,año);
        double pagos = valorVentasDiarias(dia, mes, año);
        ingresos = ventas-pagos;
        
        return ingresos;
                
    }
    public void mostraringresosDiarios(int dia, int mes, int año){
        System.out.println(ingresosDiarios(dia, mes, año));                
    }
    
    public double ingresosMensuales(int mes, int año){
        double ingresos = 0;
        double ventas = valorVentasMensuales(mes, año);
        double pagos = valorPagosMensuales(mes, año);
        ingresos = ventas-pagos;
        
        return ingresos;
                
    }
    
    public void mostraringresosMensuales(int mes, int año){
        
        System.out.println(ingresosMensuales(mes, año));
                
    }
}
