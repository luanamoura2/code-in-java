import java.util.Scanner;

public class Fatorial {

  public static void main(String[] args) {
    int vet1[] = new int[5];
    int i,j;
    int fatorial = 1;
    Scanner teclado = new Scanner(System.in);
    for (i = 0; i < 5; i++) {
      System.out.println("Digite um valor:");
      vet1[i] = teclado.nextInt();
      for (j = 1; j<= vet1[i]; j++) {
          fatorial=fatorial * j;
      }
        System.out.println("Fatorial do número é: " + fatorial); 
        fatorial=1;
    }

  }
}

