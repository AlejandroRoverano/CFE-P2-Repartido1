import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double num1, num2, num3;
        System.out.println("Ingrese el precio del producto 1: ");
        num1 = scr.nextDouble() * 1.22;
        System.out.println("Ingrese el precio del producto 2: ");
        num2 = scr.nextDouble() * 1.22;
        System.out.println("Ingrese el precio del producto 3: ");
        num3 = scr.nextDouble() * 1.22;
        System.out.println("El total es de: " + (num1+ num2+ num3));
    }
}
