import java.util.Scanner;

public class ej03 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la temperatura en grados Celsius: ");
        int grados = scanner.nextInt();
        int farenheit = (grados * 9 / 5) + 32;
        System.out.println(grados + "ºC son " + farenheit + "ºF");

        scanner.close();
    }
}
