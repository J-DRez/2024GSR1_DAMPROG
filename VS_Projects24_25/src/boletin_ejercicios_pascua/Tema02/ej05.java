import java.util.Scanner;

public class ej05 {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("OPERACIONES ARITMETICAS BÁSICAS");
        
        System.out.print("Introduce el primer número: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada no válida. Por favor, introduce un número.");
            scanner.next(); // Limpiar la entrada no válida
        }
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada no válida. Por favor, introduce un número.");
            scanner.next(); // Limpiar la entrada no válida
        }
        double num2 = scanner.nextDouble();

        System.out.println("La suma es: " + (num1 + num2));
        System.out.println("La resta es: " + (num1 - num2));
        System.out.println("La multiplicación es: " + (num1 * num2));
        if (num2 != 0) {
            System.out.println("La división es: " + (num1 / num2));
        } else {
            System.out.println("No se puede dividir entre cero.");
        }

        scanner.close();
    }
}
