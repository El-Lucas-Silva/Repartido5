/*Función recursiva que verifica que una contraseña
sea correcta (TERMINADO)
*/
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese su contraseña: ");
        String clave = read.nextLine();
        if (validarPassword(clave)){
            System.out.println("Contraseña correcta!");
        } else {
            System.out.println("Contraseña invalida");
        }
    }

    public static boolean validarPassword(String clave) {
        String contra = "ContraseñaXD";
        if (clave.length() <= 8 && clave.length() >= 14){
            return false;
        } else if (clave.equals(contra)) {
            return true;
        } else {
            return false;
        }
    }
}


