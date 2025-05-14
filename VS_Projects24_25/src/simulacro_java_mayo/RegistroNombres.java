import java.util.Scanner;
import java.util.ArrayList;

public class RegistroNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creamos el array para registrar los nombres
        ArrayList<String> nombres = new ArrayList<>();
        //La variable 'nombre' la inicializamos fuera del bucle para poder usarla luego dentro
        String nombre;
        System.out.println("Introduce los nombres que quieras añadir a la lista. Para finalizar, escribe 'fin'.");
        //Bucle para introducir los nombres, que además comprueba que no estén introducidos y lo finaliza
        while (true) {
            nombre = sc.nextLine();
            //Cuando el usuario introduce la palabra 'fin', paramos el bucle con el 'break'
            if (nombre.equalsIgnoreCase("fin")){
                break;
            }
            //Comprueba que el array no contenga el nombre introducido, de ser así lo añade, y si ya existe, salta el error y sigue con el bucle
            if (!nombres.contains(nombre)){
                nombres.add(nombre);
            } else {
                System.out.println("El nombre '" + nombre + "' ya existe.");
            }
        }
        System.out.println("La lista de nombres introducidos es:\n" + nombres);
        sc.close();
    }
}