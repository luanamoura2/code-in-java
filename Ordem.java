import java.util.Scanner;

public class ordem {

    public static void main(String[] args) 
    {
        int vet[] = new int[10];
        int i, j, aux = 0;

        Scanner teclado = new Scanner(System.in);
        teclado.close();

    
        for (i = 0; i < 10; i++) 
        {
            System.out.print("Digite um valor: ");
            vet[i] = teclado.nextInt();

            if (vet[i] < 1)
            {
                System.out.println("Número negativo.");
                break;
            }
           
        }

        System.out.print("\nVetor principal: ");
        for (i = 0; i < 10; i++) 
        {
            System.out.print(vet[i] + " ");
        }


        for (i = 0; i < 10 - 1; i++) 
        {
            for (j = 0; j < 10 - i - 1; j++) 
            {
                if (vet[j] > vet[j + 1]) 
                {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }

        System.out.print("\nVetor ordenado em ordem crescente: ");
        for (i = 0; i < 10; i++) 
        {
            System.out.print(vet[i] + " ");
        }

        for (i = 0; i < 10 - 1; i++) 
        {
            for (j = 0; j < 10 - i - 1; j++) 
            {
                if (vet[j] < vet[j + 1])
                 {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }

        System.out.print("\nVetor ordenado em ordem decrescente: ");
        for (i = 0; i < 10; i++) 
        {
            System.out.print(vet[i] + " ");
        } 

        

      
    }
}
