import java.util.Scanner;

public class Quadradomagico {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    int Matriz[][] = new int[3][3];
    int i, j;
    int somalinha1, somalinha2, somalinha3;
    int somacol1, somacol2, somacol3;
    int diagonal1, diagonal2;

    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++) {
        System.out.print("Digite o elemento da matriz[" + i + "," + j + "]:");
        Matriz[i][j] = teclado.nextInt();
      }

    }
    System.out.print("Matriz 3x3:");
    for (i = 0; i < 3; i++) {
      System.out.print("\n");
      for (j = 0; j < 3; j++) {
        System.out.print(Matriz[i][j] + " ");
      }

    }

    somalinha1 = Matriz[0][0] + Matriz[0][1] + Matriz[0][2];
    somalinha2 = Matriz[1][0] + Matriz[1][1] + Matriz[1][2];
    somalinha3 = Matriz[2][0] + Matriz[2][1] + Matriz[2][2];

    somacol1 = Matriz[0][0] + Matriz[1][0] + Matriz[2][0];
    somacol2 = Matriz[0][1] + Matriz[1][1] + Matriz[2][1];
    somacol3 = Matriz[0][2] + Matriz[1][2] + Matriz[2][2];

    diagonal1 = Matriz[0][0] + Matriz[1][1] + Matriz[2][2];
    diagonal2 = Matriz[0][2] + Matriz[1][1] + Matriz[2][0];

    if (somalinha1 != somalinha2 && somalinha1 != somalinha3 && somalinha2 != somalinha3 || somacol1 != somacol2 && somacol1 != somacol3 && somacol2 != somacol3 || diagonal1 != diagonal2 ) 
    {
      System.out.print("\nNao e um quadrado magico :[");
    } 
    else 
    { 
      System.out.print("\nE um quadrado magico :]");
    }

  }
}

