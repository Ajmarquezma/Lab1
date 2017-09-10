package laboratorio.punto.pkg2;
/**
 *
 * @author Juan Esteban Muñoz jemunozva@unal.edu.co / Mateo Pacheco - cpachecof@unal.edu.co / Aldo Marquez - @unal.edu.co
 */
public class Empleado {
    private double salario;
    private String nombre;
    private String contrato;
    private double horaEntrada;
    private double horaSalida;
    private double horasTrabajadas;
    private double valorPagoTotal ;

    public Empleado(double salario, String nombre, String contrato, double horaEntrada, double horaSalida) {
        this.salario = salario;
        this.nombre = nombre;
        this.contrato = contrato;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public double getSalario() {
        return salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrato() {
        return contrato;
    }

    public double getHoraEntrada() {
        return horaEntrada;
    }

    public double getHoraSalida() {
        return horaSalida;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getValorPagoTotal() {
        return valorPagoTotal;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setHoraEntrada(double horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public void setHoraSalida(double horaSalida) {
        this.horaSalida = horaSalida;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setValorPagoTotal(double valorPagoTotal) {
        this.valorPagoTotal = valorPagoTotal;
    }
    
    public double calcularHorasTrabajadas(){
        this.horasTrabajadas = horaSalida - horaEntrada;
        return horasTrabajadas;
    }
    
    public double calcularPagoSalario () {
        this.valorPagoTotal = horasTrabajadas*salario;
        return valorPagoTotal;
    }
    
    
}
