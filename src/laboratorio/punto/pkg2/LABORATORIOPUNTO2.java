package laboratorio.punto.pkg2;
import java.util.*;
/**
 * @Autores: Juan Esteban Muñoz jemunozva@unal.edu.co / Mateo Pacheco - cpachecof@unal.edu.co / Aldo Marquez - ajmarquezma@unal.edu.co
*/

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
        
        int desicion = in.nextInt();
        switch(desicion){
            case 1: System.out.println("");
                break;
            case 2: System.out.println("");
                break;
            case 3: System.out.println("");
                break;
            case 4: System.out.println("");
                break;
            case 5: System.out.println("");
                break;
            case 6: System.out.println("");
                break;
            default: System.out.println("");
                break;
        }

    }

}
