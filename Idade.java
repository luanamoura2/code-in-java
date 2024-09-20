import java.util.Scanner;

public class Idade {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    int ida;

    System.out.println("Digite sua idade");
    ida = teclado.nextInt();

    if ((ida <= 11)) {
      System.out.println("Você é uma criança");
    } else {
      if ((ida >= 12 && ida <= 17)) {
        System.out.println("Você é um adolescente");
      } else {

        if ((ida >= 18 && ida <= 59)) {
          System.out.println("Você é um adulto");

        } else {

          System.out.println("Você é um idoso");
        }

      }
    }
    teclado.close();
  }

}

