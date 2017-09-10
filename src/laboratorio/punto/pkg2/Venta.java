package laboratorio.punto.pkg2;
import java.util.*;
/**
 * @author Juan Esteban Muñoz jemunozva@unal.edu.co / Mateo Pacheco - cpachecof@unal.edu.co / Aldo Marquez - @unal.edu.co
 */
public class Venta {

    private ArrayList<SubtotalVentas> subtotales;
    private Fecha fecha;

    public ArrayList<SubtotalVentas> getSubtotales() {
        return subtotales;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Venta(Fecha fecha) {
        this.fecha = fecha;
        this.subtotales = new ArrayList();
    }

    public void addSubtotal(SubtotalVentas sub) {
        subtotales.add(sub);
    }

    public double getTotal() {
        double total = 0;
        for (SubtotalVentas s : subtotales) {
            total += s.getSubTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Venta: " + '\n' + "fecha: " + fecha + '\n' + "subtotales: " + subtotales + '\n' + "Total" + getTotal();
    }

}
