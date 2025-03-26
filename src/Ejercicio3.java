import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese el año actual: ");
        num1 = scr.nextInt();
        System.out.println("Ingrese su año de nacimiento: ");
        num2 = scr.nextInt();
        System.out.println("Usted tiene " + (num1 - num2));
    }
}
