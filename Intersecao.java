import java.util.Random;

public class Intersecao {
    public static void main(String[] args) {

        int vetA[] = new int[10];
        int vetB[] = new int[20];
        int vetC[] = new int[30]; 
        int i, j, k = 0;

        Random gerador = new Random();

        System.out.print("Vetor A: ");
        for (i = 0; i < 10; i++) {
            vetA[i] = gerador.nextInt(50);
            System.out.print(vetA[i] + " ");
        }

        System.out.print("\nVetor B: ");
        for (i = 0; i < 20; i++) {
            vetB[i] = gerador.nextInt(50);
            System.out.print(vetB[i] + " ");
        }

  
        for (i = 0; i < 10; i++) {
            int encontrado = 0;
            for (j = 0; j < 20; j++) {
                if (vetA[i] == vetB[j]) {
                    encontrado++;
                }
            }
            if (encontrado == 0) {
                vetC[k++] = vetA[i];
            }
        }

 
        for (i = 0; i < 20; i++) {
            int encontrado = 0;
            for (j = 0; j < 10; j++) {
                if (vetB[i] == vetA[j]) {
                    encontrado++;
                }
            }
            if (encontrado == 0) {
                vetC[k++] = vetB[i];
            }
        }

        System.out.print("\nVetor C: ");
        for (i = 0; i < k; i++) {
            System.out.print(vetC[i] + " ");
        }
    }
}
