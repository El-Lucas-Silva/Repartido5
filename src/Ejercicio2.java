/*Crear un procedimiento que reciba un array de 5 numeros
e imprima el mayor de ellos (TERMINADO)
*/
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int array [] = {3,9,1,7,4};
        System.out.println("Mayor valor: "+mayorValor(array));
    }

    public static int mayorValor(int array[]) {
        int maxNum = array[0];
        for (int i = 0 ; i < array.length ; i++){
            if (array[i] > maxNum){
                maxNum = array[i];
            }
        }
        return maxNum;
    }
}

