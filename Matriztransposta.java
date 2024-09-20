import java.util.Scanner;
import java.util.Random;

public class Matriztransposta
 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random gerador = new Random();
        int Matriz[][] = new int[5][5];
        int i, j;
        for (i = 0; i <= 4; i++) {
            for (j = 0; j <= 4; j++) {
                Matriz[i][j] = gerador.nextInt(10, 50);
            }

        }
        for (i = 0; i <= 4; i++) {
            System.out.print("\n");
            for (j = 0; j <= 4; j++) {
                System.out.print(Matriz[i][j] + " ");
            }

            teclado.close();
        }
        System.out.print("\n");

        for (j = 0; j <= 4; j++) {
            System.out.print("\n");
            for (i = 0; i <= 4; i++) {
                System.out.print(Matriz[i][j] + " ");
            }

        }
    }
}

