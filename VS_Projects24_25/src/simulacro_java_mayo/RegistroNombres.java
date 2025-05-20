import java.util.Scanner;
import java.util.ArrayList;

public class RegistroNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creamos el array para registrar los nombres
        ArrayList<String> nombres = new ArrayList<>();
        //La variable 'nombre' la inicializamos fuera del bucle para poder usarla luego dentro
        String nombre;
        boolean fin;
        System.out.println("Introduce los nombres que quieras añadir a la lista. Para finalizar, escribe 'fin'.");
        //Bucle para introducir los nombres.
        //Comprueba que el array no contenga el nombre introducido y que no sea la palabra 'fin'.
        //De ser así lo añade y permite seguir introduciendo nombres.
        //Si ya existe, salta el error y sigue con el bucle.
        do {
            nombre = sc.nextLine().trim();
            //Esto da valor 'true' si nombre = true, y false si no lo es.
            //Se puede simplificar el operador ternario quitando '? true : false' y hará lo mismo
            fin = (nombre.equalsIgnoreCase("fin") ? true : false);

            if (!fin) {
                if (!nombres.contains(nombre)){
                nombres.add(nombre);
                } else {
                System.out.println("El nombre '" + nombre + "' ya existe.");
                }
            }

        } while (!fin);

        System.out.println("\nLa lista de nombres introducidos es:\n");
        
        for (String listaNombres : nombres) {
        System.out.println("- " + listaNombres);
        }

        sc.close();
    }
}