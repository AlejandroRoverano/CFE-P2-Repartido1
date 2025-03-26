import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String nombre, ciudad;
        int edad;
        System.out.println("Ingrese su nombre: ");
        nombre = scr.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = scr.nextInt();
        System.out.println("Ingrese su Ciudad de Orígen: ");
        ciudad = scr.nextLine();
        System.out.println("Hola " + nombre + " tenés " + edad + " y vivís en " + ciudad);
    }
}
