import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese la base del rectángulo: ");
        num1 = scr.nextInt();
        System.out.println("Ingrese la altura del rectángulo: ");
        num2 = scr.nextInt();
        System.out.println("El rectángulo tiene " + (num1 * num2) + " cms");
    }
}
