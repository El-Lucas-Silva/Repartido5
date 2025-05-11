/*Crear una funcion que reciba un numero entero y retorne true si es par
y false si es impar (TERMINADO)
*/
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = read.nextInt();
        imparpares(numero);
    }

    public static void imparpares(int num) {
        if(num == 0){
            System.out.println("El valor es 0");
        }
        else if (num % 2 == 0) {
            System.out.println("El numero es par");
        }
        else {
            System.out.println("El numero es impar");
        }
    }
}

