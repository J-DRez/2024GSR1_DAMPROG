import java.util.Scanner;
import java.util.ArrayList;

public class RegistroNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creamos el array para registrar los nombres
        ArrayList<String> nombres = new ArrayList<>();
        //La variable 'nombre' la inicializamos fuera del bucle para poder usarla luego dentro
        String nombre;
        System.out.println("\nIntroduce los nombres que quieras añadir a la lista. Para finalizar, escribe 'fin'.");
        //Bucle para introducir los nombres.
        //Comprueba que el array no contenga el nombre introducido y que no sea la palabra 'fin'.
        //De ser así lo añade y permite seguir introduciendo nombres.
        //Si ya existe, salta el error y sigue con el bucle.
        do {
            nombre = sc.nextLine();
            if (!nombres.contains(nombre)&&!nombre.equalsIgnoreCase("fin")){
                nombres.add(nombre);
            } else if (nombres.contains(nombre)&&!nombre.equalsIgnoreCase("fin")){
                System.out.println("El nombre '" + nombre + "' ya existe.");
            }
        } while (!nombre.equalsIgnoreCase("fin"));

        System.out.println("La lista de nombres introducidos es:\n" + nombres);
        sc.close();
    }
}