import java.util.Scanner;

public class ej04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("--CONTADOR--\n");
        System.out.print("Introduce el número hasta el que quieres contar: ");

        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}
