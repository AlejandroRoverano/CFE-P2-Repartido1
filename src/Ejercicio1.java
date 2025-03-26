import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String nombre = "";
        System.out.println("Ingrese un nombre: ");
        nombre = scr.nextLine();
        System.out.println("Bienvenido al sistema " + nombre);
    }
}