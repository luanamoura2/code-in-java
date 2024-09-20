import java.util.Scanner;

public class Impar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int v;

        System.out.println("Digite o valor:");
        v = teclado.nextInt();

        if (v % 2 == 0) {
            System.out.println("Valor par");
        } else {
            System.out.println("Valor ímpar");
        }

        teclado.close();
    }
}
