package entregas2025.actividad05;

import java.util.Scanner;

public class FuncionRecursiva {

    /*
     * Escribe un programa que calcule las combinaciones posibles de n elementos tomados
     * de k en k utilizando recursividad. Una combinación es un subconjunto de tamaño k 
     * extraído de un conjunto de elementos.
     * 
     * Requisitos:
     * 
     * El usuario debe ingresar n (el tamaño del conjunto) y k (el tamaño del subconjunto).
     * Usa recursividad para calcular el número total de combinaciones.
     * Muestra el número total de combinaciones posibles.
     */

    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce el número de elementos (n): ");
        int n = escaner.nextInt();

        System.out.println("Introduce el número de elementos a tomar (k): ");
        int k = escaner.nextInt();

        escaner.close();

        if (n < k) {
            System.out.println("El tamaño del subconjunto no puede ser mayor que el conjunto.");
        } else if (n < 0 || k < 0) {
            System.out.println("Los números introducidos deben ser mayores que 0.");        
        } else {
            System.out.println("El número de combinaciones posibles es: " + calcular(n, k));
        }
        
    }

    public static int calcular(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return calcular(n - 1, k - 1) + calcular(n - 1, k);
        }
    }
}
