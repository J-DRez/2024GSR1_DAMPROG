package entregas2025;

public class SobrecargaFunciones {

    /*
     * Crea un programa que implemente una función sobrecargada llamada "calcular" que realice las siguientes operaciones
     * dependiendo del tipo de parámetro recibido:
     *
     * 1.Media (int[]): Calcula la media de un arreglo de números enteros.
     * 2.Moda (double[]): Encuentra el valor más frecuente en un arreglo de números decimales.
     * 3.Mediana (String[]): Determina la mediana (orden alfabético) de un arreglo de cadenas.
     * 
     * Requisitos:
     *
     * 1.Implementa tres versiones de la función "calcular" para manejar enteros, decimales y cadenas.
     * 2.Muestra ejemplos para cada caso.
     */

    public static void main(String[] args) {
        System.out.println("Esta es la media: " + calcular(1, 2, 3, 4, 5));
        System.out.println("Esta es la moda: " + calcular(1.1, 2.2, 3.3, 4.4, 5.5, 5.5));
        System.out.println("Esta es la mediana: " + calcular("Verde", "Azul", "Amarillo", "Rojo", "Naranja", "Fucsia"));
    }

    public static int calcular(int... numeros) {
        int media = 0;
        for (int numero : numeros) {
            media += numero;
        }
        return media / numeros.length;
    }

    public static double calcular(double... numeros) {
        double moda = 0;
        int frecuencia = 0;
        for (int i = 0; i < numeros.length; i++) {
            int contador = 0;
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    contador++;
                }
            }
            if (contador > frecuencia) {
                moda = numeros[i];
                frecuencia = contador;
            }
        }
        return moda;
    }

    public static String calcular(String... cadenas) {
        String mediana = "";
        for (int i = 0; i < cadenas.length; i++) {
            for (int j = i + 1; j < cadenas.length; j++) {
                if (cadenas[i].compareTo(cadenas[j]) > 0) {
                    String aux = cadenas[i];
                    cadenas[i] = cadenas[j];
                    cadenas[j] = aux;
                }
            }
        }
        if (cadenas.length % 2 == 0) {
            mediana = cadenas[cadenas.length / 2 - 1] + " y " + cadenas[cadenas.length / 2];
        } else {
            mediana = cadenas[cadenas.length / 2];
        }
        return mediana;
    }
    
}