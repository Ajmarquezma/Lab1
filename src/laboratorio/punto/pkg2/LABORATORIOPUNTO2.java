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

    }

}
