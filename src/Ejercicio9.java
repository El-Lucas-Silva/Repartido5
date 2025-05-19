/*Función que verifique que una cedula sea valida (TERMINADO)
*/
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese su contraseña: ");
        String cedula = read.nextLine();
        if (validarCedula(cedula)){
            System.out.println("Cedula valida");
        } else {
            System.out.println("Cedula invalida");
        }
    }

    public static boolean validarCedula(String cedula) {
        if (cedula.length() == 8 && cedula.length() == 8){

        else {
            return false;
            }
        } else if (clave.equals(contra)) {
            return true;
        } else {
            return false;
        }
    }
}


