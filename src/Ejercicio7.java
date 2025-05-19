/*Función recursiva que suma todos los numeros de
1 hasta n (TERMINADO)
*/

public class Ejercicio7 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Suma de 1 a "+num+": "+sumaRecursiva(num));
    }

    public static int sumaRecursiva(int num) {
        if (num == 1){
            return 1;
        } else {
            return (num + sumaRecursiva(num - 1));
        }
    }
}


