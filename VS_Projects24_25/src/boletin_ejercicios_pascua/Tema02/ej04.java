import java.util.Scanner;

public class ej04 {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("- CÁLCULO DEL ÁREA DE UN TRIÁNGULO -");
        System.out.println("\nIntroduce la base del triángulo: ");
        double base = scanner.nextDouble();
        System.out.println("\nIntroduce la altura del triángulo: ");
        double altura = scanner.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("\nEl área del triángulo es: " + area + " cm²");

        scanner.close();

    }
}
