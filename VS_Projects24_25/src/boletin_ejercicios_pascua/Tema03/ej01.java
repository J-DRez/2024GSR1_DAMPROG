import java.util.Random;

public class ej01 {
    public static void main(String[] args) {

        Random random = new Random();
        int numAleatorio = random.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100

        System.out.println("El número aleatorio es: " + numAleatorio);

        if (numAleatorio % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }
}
