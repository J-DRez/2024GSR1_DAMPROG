/*Desarrolla un programa en Java que permita al usuario introducir nombres de
* personas. El programa debe:
* 1. Leer nombres desde la entrada estándar hasta que el usuario escriba `"fin"`.
* 2. Almacenar los nombres en un `ArrayList`.
* 3. No debe guardar nombres repetidos (si se repite uno, se ignora).
* 4. Al final, mostrar la lista completa de nombres introducidos sin duplicados.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Simulacro01 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>(); // Crear un ArrayList para almacenar los nombres

        while (true) {
            System.out.print("Introduce un nombre (o 'fin' para terminar): ");
            String nombre = scanner.nextLine(); // Leer el nombre del usuario

            if (nombre.equalsIgnoreCase("fin")) { // Si el usuario introduce "fin", salir del bucle
                break;
            }

            if (!nombres.contains(nombre)) { // Comprobar si el nombre ya está en la lista
                nombres.add(nombre); // Si no está, añadirlo a la lista
            } else {
                System.out.println("El nombre '" + nombre + "' ya ha sido introducido. Se ignorará.");
            }
        }

        System.out.println("Lista de nombres introducidos sin duplicados: " + nombres); // Mostrar la lista final
        scanner.close(); // Cerrar el escáner
    }    
}
