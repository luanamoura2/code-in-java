import java.util.Random;
import java.util.Scanner;

public class MegaSena {
    
    public static void mostrarVetor(int[] vetor){
        String texto = "[";

        for(int i=0;i<vetor.length;i++){
            texto = texto + vetor[i]+",";
        }

        texto = texto+ "]";

        System.out.println(texto);
    }

    public static void main(String[] args) {
        Random rand = new Random(); 
        Scanner scan = new Scanner(System.in);
        
        int[] sorteio;
        int[] palpite;
        int numero;

        sorteio = new int[6];
        palpite = new int[6];

        for(int i=0;i<6;i++){
            sorteio[i] = rand.nextInt(60)+1;
        }
        
        mostrarVetor(sorteio);

        for(int i=0;i<6;i++){
            System.out.println("Digite um numero:");
            numero = scan.nextInt();
            palpite[i] = numero;
        }

        mostrarVetor(palpite);

        //sortear 6 numeros
        //pedir para o usuario digitar 6 numeros
        //comparar os numeros digitados com os numeros sorteados
        //contar os acertos.
        //mostrar os acertos
    }
}
