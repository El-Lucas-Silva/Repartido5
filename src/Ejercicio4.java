/*Función que recibe un numero y muestra todos los impares
hasta llegar al mismo (TERMINADO)
*/

public class Ejercicio4 {
    public static void main(String[] args) {
    imparesUntil(8);
    }

    public static void imparesUntil(int num) {
        System.out.print("Todos los impares entre 0 y "+num+": ");
        for (int i = 1; i <= num; i += 2) {
            System.out.print(i + " ");
        }
    }
}


