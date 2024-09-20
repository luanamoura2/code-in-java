import java.util.Scanner;

public class TomadaDecisaoSequencial {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int a;

        System.out.println("Digite valor para a");
        a = teclado.nextInt();

        if (a > 1) {
            System.out.println("Positivo");
        } else {
            if (a == 0) {
                System.out.println("Neutro");
            } else {
                System.out.println("Negativo");
            }
        }
        teclado.close();
    }

}

