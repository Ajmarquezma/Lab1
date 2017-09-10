package laboratorio.punto.pkg2;

import java.util.ArrayList;

/**
 * @Autores: Juan Esteban Muñoz jemunozva@unal.edu.co / Mateo Pacheco -
 * cpachecof@unal.edu.co / Aldo Marquez - ajmarquezma@unal.edu.co
 */
public class PedidoProveedor {

    private String nombreProveedor;
    private double fechaLimiteAPagar;
    private ArrayList<SubtotalPedido> subtotales;
    private Fecha fecha;

    public PedidoProveedor(String nombreProveedor, double fechaLimiteAPagar, Fecha fecha) {
        this.nombreProveedor = nombreProveedor;
        this.fechaLimiteAPagar = fechaLimiteAPagar;
        this.fecha = fecha;
        this.subtotales = new ArrayList();
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void addSubtotal(SubtotalPedido sub) {
        subtotales.add(sub);
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public double getFechaLimiteAPagar() {
        return fechaLimiteAPagar;
    }

    public double getTotal() {
        double total = 0;
        for (SubtotalPedido p : subtotales) {
            total += p.getsubtotalPedido();
        }
        return total;
    }

    @Override
    public String toString() {
        return "PedidoProveedor:" + '\n' + "nombreProveedor: " + nombreProveedor + '\n' + "fechaLimiteAPagar: " + fechaLimiteAPagar + '\n' + "subtotales: " + subtotales + '\n' + "fecha del pedido: " + fecha + '\n' + "Total: " + getTotal();
    }

}
