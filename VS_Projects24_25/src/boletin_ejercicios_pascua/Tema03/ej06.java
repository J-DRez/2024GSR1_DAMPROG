import java.util.Scanner;

public class ej06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--Menú interactivo--\n");

        int opcion;

        do {   
            System.out.println("Escoge una opción:");
            System.out.println("1.Saluda");
            System.out.println("2.Despídete");
            System.out.println("3.Cierra programa");
            System.out.println();

            opcion = sc.nextInt();        
            switch (opcion) {
                case 1:
                    System.out.println("¡Hola!\n");
                    break;
                case 2:
                    System.out.println("¡Adiós!\n");
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Introduce una opción válida.\n");
                    break;
            }
        } while (opcion != 3);
        
        sc.close();
    }
}
