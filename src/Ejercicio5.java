/*Función recursiva que devuelva el factorial
de un numero (TERMINADO)
*/

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int num) {
        if (num == 0){
            return 1;
        } else {
            return (num * factorial(num - 1));
        }
    }
}


