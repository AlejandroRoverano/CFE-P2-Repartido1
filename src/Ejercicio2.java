import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese el número 1 ");
        num1 = scr.nextInt();
        System.out.println("Ingrese el número 2 ");
        num2 = scr.nextInt();
        System.out.println("Resultado de la suma " + (num1 + num2));
    }
}