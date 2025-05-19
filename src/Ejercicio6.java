/*Función recursiva que muestre todos los numero del
1 al que se elija (TERMINADO)
*/

public class Ejercicio6 {
    public static void main(String[] args) {
        unoHastaNum(4);
    }

    public static int unoHastaNum(int num) {
        if (num == 0) {
            return 0;
        }
        unoHastaNum(num - 1);
        System.out.print(num + " ");
        return num;
    }
}


