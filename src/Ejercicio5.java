import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double num1;
        System.out.println("Ingrese la temperatura en Celsius: ");
        num1 = scr.nextDouble();
        System.out.println("la temperatura en Fahrenheit es: " + (num1 * (9/5) + 32));
    }
}
