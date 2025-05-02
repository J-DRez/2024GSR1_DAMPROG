import java.util.Scanner;

public class ej02 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int a = scanner.nextInt();
        System.out.println("Introduce otro número: ");
        int b = scanner.nextInt();

        System.out.println("La suma de " + a + " y " + b + " es: " + (a + b));

        scanner.close();
    }
}
