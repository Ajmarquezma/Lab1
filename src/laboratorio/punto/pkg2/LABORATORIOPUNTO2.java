package laboratorio.punto.pkg2;

import java.util.*;

public class LABORATORIOPUNTO2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("************ BIENVENIDO A TU TIENDA VIRTUAL ************");
        System.out.println("Porfavor ingrese los datos de la tienda:");
        System.out.println("Ingrese el Nombre de la Tienda y el Nombre del Dueño:");
        String Nombre_Tienda = in.nextLine();
        String Nombre_Dueño = in.nextLine();
        Tienda Tienda1 = new Tienda (Nombre_Tienda, Nombre_Dueño);
        
        System.out.println(" ***** BIENVENIDO AL MENU DE LA TIENDA"+Nombre_Tienda+" *****");
        System.out.println(" ¿QUE OPCION DESEA ESCOGER? :");
        System.out.println("1. AGREGAR UN PRODUCTO");
        System.out.println("2. AGREGAR UN EMPLEADO");
        System.out.println("3. VER LISTA DE PRODUCTOS");
        System.out.println("4. VER LISTA DE EMPLEADOS");
        System.out.println("5. HACER PEDIDO A PROVEEDORES");
        System.out.println("6. CONSULTAR CONTABILIDAD");

    }

}
