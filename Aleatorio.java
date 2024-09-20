import java.util.Random;
import java.util.Scanner;

public class Aleatorio 
{
    public static void main(String []args)
    {
        Scanner teclado = new Scanner(System.in);


        Random gerador = new Random();

        int random = gerador.nextInt(10);
        int palpite;

        do
        {
            
            System.out.println("\nDigite um numero de 0 a 10:");
            palpite = teclado.nextInt();

            if (palpite == random)
            {
                System.out.println("\nAcertou!");  
            }
            else if (palpite < random)
            {
                System.out.println("\nPalpite menor.");   
            }
            else if (palpite > random)
            {
                System.out.println("\nPalpite maior.");   

            }
        

        } while ( palpite != random );

        teclado.close();

    }
}
