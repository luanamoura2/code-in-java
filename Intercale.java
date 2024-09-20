import java.util.Random;

public class intercale {
    public static void main(String[] args) {

        int vetA[] = new int[10];
        int vetB[] = new int[10];
        int vetC[] = new int[20];
        int i;

        Random gerador = new Random();

        System.out.print("\nVetor A: ");
        for (i = 0; i < 10; i++) {
            vetA[i] = (gerador.nextInt(50));
            System.out.print(vetA[i] + " ");
        }

        System.out.print("\nVetor B: ");
        for (i = 0; i < 10; i++) {
            vetB[i] = (gerador.nextInt(50));
            System.out.print(vetB[i] + " ");
        }

        for (i = 0; i < 10; i++) {
            vetC[2 * i] = vetA[i];
            vetC[2 * i + 1] = vetB[i];

        }

        System.out.print("\nVetor C: ");
        for (i = 0; i < 20; i++) {
            System.out.print(vetC[i] + " ");

        }

    }

}

