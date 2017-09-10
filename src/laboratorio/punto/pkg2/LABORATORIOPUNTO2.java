package laboratorio.punto.pkg2;

import java.util.*;

/**
 * @Autores: Juan Esteban Muñoz jemunozva@unal.edu.co / Mateo Pacheco -
 * cpachecof@unal.edu.co / Aldo Marquez - ajmarquezma@unal.edu.co
 */

public class LABORATORIOPUNTO2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("************ BIENVENIDO A TU TIENDA VIRTUAL ************");
        System.out.println("Por favor ingrese los datos de la tienda:");
        System.out.println("Ingrese el Nombre de la Tienda y el Nombre del Dueño:");
        String Nombre_Tienda = in.nextLine();
        String Nombre_Dueño = in.nextLine();
        Tienda Tienda1 = new Tienda(Nombre_Tienda, Nombre_Dueño);
        Contabilidad contabilidad = new Contabilidad();
        Inventario inventario = new Inventario();

        System.out.println(" ***** BIENVENIDO AL MENU DE LA TIENDA " + Nombre_Tienda + " *****");
        System.out.println(" ¿QUE OPCION DESEA ESCOGER? :");
        System.out.println("1. AGREGAR UN PRODUCTO");
        System.out.println("2. AGREGAR UN EMPLEADO");
        System.out.println("3. VER LISTA DE PRODUCTOS");
        System.out.println("4. VER LISTA DE EMPLEADOS");
        System.out.println("5. HACER PEDIDO A PROVEEDORES");
        System.out.println("6. CONSULTAR CONTABILIDAD");
        System.out.println("7. HACER UNA VENTA");
        int decision = in.nextInt();
        switch(decision){
            case 1: 
                System.out.println("INGRESE LOS DATOS DEL NUEVO PRODUCTO:");
                System.out.println("Digite cuantos productos quiere añadir a la lista:");
                int Noproductos = in.nextInt();
                for ( int i = 0; i < Noproductos ; i++){
                    System.out.println("Datos Producto "+(i+1)+" :");
                    System.out.println("Digite el nombre del producto, El precio del producto y el tipo del producto:");
                    String nombreProducto = in.next();
                    double precioVenta = in.nextDouble();
                    String tipoProducto = in.next();
                    Tienda1.addProducto(new Producto(nombreProducto, precioVenta, tipoProducto));
                }
                break;
            case 2: 
                System.out.println("INGRESE LOS DATOS DEL NUEVO EMPLEADO:");
                System.out.println("Digite cuantos empleados quiere añadir a la lista:");
                int Noempleado = in.nextInt();
                for ( int i = 0; i < Noempleado ; i++){
                    System.out.println("Datos Empleado "+(i+1)+" :");
                    System.out.println("Digite el salario, el nombre del empleado, Duracion del contrato, la hora de Entrada y la hora de Salida");
                    double salario = in.nextDouble();
                    String nombreEmpleado = in.next();
                    String contrato = in.next();
                    double horaEntrada = in.nextDouble();
                    double horaSalida = in.nextDouble();
                    Empleado empleado = new Empleado( salario, nombreEmpleado, contrato, horaEntrada, horaSalida);
                    Tienda1.addEmpleado(empleado);
                    contabilidad.addEmpleados(nombreEmpleado, empleado);
                }
                System.out.println("");
                break;
            case 3: System.out.println("LOS PRODUCTOS DE LA TIENDA " + Nombre_Tienda + "SON:");
                Tienda1.listaProductos();
                break;
            case 4: System.out.println("LOS EMPLEADOS DE LA TIENDA " + Nombre_Tienda + " SON:");
                Tienda1.listaEmpleados();
                break;
            case 5:
                System.out.println("INTRODUZCA LOS DATOS DEL PEDIDO:");
                System.out.println("Ingrese el nombre del Proveedor, la fecha Limite A Pagar y el dia, mes y año de realizacion del pedido:");
                String nombreProveedor = in.next();
                double fechaLimiteAPagar = in.nextDouble();
                int Dia = in.nextInt();
                int Mes = in.nextInt();
                int Año = in.nextInt();
                PedidoProveedor p = new PedidoProveedor( nombreProveedor, fechaLimiteAPagar, new Fecha ( Dia, Mes, Año));
                System.out.println("Ingrese el número de subtotales");
                int nosubtotales = in.nextInt();
                
                for ( int i = 0; i < nosubtotales ; i++){
                    
                    System.out.println("Datos subtotal "+(i+1)+" :");
                    System.out.println("Digite el nombre del producto, cantidad en tienda, el precio de compra del producto y el tipo del producto:");
                    String nombreProducto = in.next();
                    Integer cantidad= in.nextInt();
                    Integer preciocompra = in.nextInt();
                    String tipoProducto = in.next();
                    Producto producto = new Producto(nombreProducto, preciocompra, tipoProducto);
                    SubtotalPedido a = new SubtotalPedido(producto,preciocompra, inventario);
                    p.addSubtotal(a);
                }
                System.out.println(p);
                
                break;
            case 6: 
                System.out.println("¿QUE DESEA CONSULTAR?");
                System.out.println("1. CONSULTAR LAS VENTAS EN UN DIA");
                System.out.println("2. CONSULTAR LAS VENTAS EN UN MES");
                System.out.println("3. CONSULTAR LAS NOMINAS DE LOS EMPLEADOS");
             int consulta= in.nextInt();
             switch(consulta){
                case 1: System.out.println("Ingrese un día a consultar");
                    int dia = in.nextInt();
                    System.out.println("Ingrese un mes a consultar");
                    int mes = in.nextInt();
                    System.out.println("Ingrese un año a consultar");
                    int año = in.nextInt();
                    contabilidad.mostrarVentasDiarias(dia,mes,año);
                    break;
                case 2: System.out.println("Ingrese un mes a consultar");
                    System.out.println("Ingrese un mes a consultar");
                    int mmes = in.nextInt();
                    System.out.println("Ingrese un año a consultar");
                    int aaño = in.nextInt();
                    contabilidad.mostrarVentasMensuales(mmes,aaño);
                    break;
                case 3:  System.out.println("Ingrese un día a consultar");
                    int diap = in.nextInt();
                    System.out.println("Ingrese un mes a consultar");
                    int mesp = in.nextInt();
                    System.out.println("Ingrese un año a consultar");
                    int añop = in.nextInt();
                    contabilidad.mostrarPagosDiarios(diap,mesp,añop);
                 break;
                case 4: System.out.println("Ingrese un mes a consultar");
                    System.out.println("Ingrese un mes a consultar");
                    int mmesp = in.nextInt();
                    System.out.println("Ingrese un año a consultar");
                    int aañop = in.nextInt();
                    contabilidad.mostrarPagosMensuales(mmesp,aañop);
                    break;
                case 5: System.out.println("Ingrese un día a consultar");
                    int diai = in.nextInt();
                    System.out.println("Ingrese un mes a consultar");
                    int mesi = in.nextInt();
                    System.out.println("Ingrese un año a consultar");
                    int añoi = in.nextInt();
                    contabilidad.mostraringresosDiarios(diai,mesi,añoi);
                    break;
                case 6: System.out.println("Ingrese un mes a consultar");
                    System.out.println("Ingrese un mes a consultar");
                    int mmesi = in.nextInt();
                    System.out.println("Ingrese un año a consultar");
                    int aañoi = in.nextInt();
                    contabilidad.mostraringresosMensuales(mmesi,aañoi);
                    break;
                case 7: System.out.println("ingrese el nombre de un empleado");
                    String nombre= in.next();
                    contabilidad.consultarSalarioEmpleado(nombre);
                    break;
                default: System.out.println("Opcion no valida");
                    break;
                }
                break;
            case 7:
                System.out.println("INTRODUZCA LOS DATOS DE LA VENTA:");
                System.out.println("Ingrese el dia, mes y año de realizacion de la venta:");
                int Diav = in.nextInt();
                int Mesv = in.nextInt();
                int Añov = in.nextInt();
                Venta v = new Venta( new Fecha ( Diav, Mesv, Añov));
                System.out.println("Ingrese el número de subtotales");
                int nosubtotalesv = in.nextInt();
                for ( int i = 0; i < nosubtotalesv ; i++){
                    System.out.println("Datos subtotal "+(i+1)+" :");
                    System.out.println("Digite el nombre del producto, El precio de compra del producto y el tipo del producto:");
                    String nombreProducto = in.next();
                    int preciocompra = in.nextInt();
                    String tipoProducto = in.nextLine();
                    SubtotalVentas a = new SubtotalVentas(new Producto(nombreProducto, preciocompra, tipoProducto),preciocompra, inventario);
                    v.addSubtotal(a);
                }
                System.out.println(v);
                break;
            default: System.out.println("Opcion no valida");
                break;
        }
                      
                
    }

}
