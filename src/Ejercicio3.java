import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Mayor Numero: "+mayorNum(5,8));
    }

    public static int mayorNum(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
    }
}
}

