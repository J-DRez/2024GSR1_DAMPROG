import java.util.Scanner;

public class ej03 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("--TABLA DE MULTIPLICAR--");
        System.out.println("\nIntroduce el número que quieres consultar:\n");

        int num = sc.nextInt();

        System.out.println("\nEsta es la tabla de multiplicar del " + num + ".\n");

        for (int i = 1; i<=10; i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }

        sc.close();
    }
}
