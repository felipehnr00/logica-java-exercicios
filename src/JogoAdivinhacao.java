import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();

        int numerosecreto = gerador.nextInt(100) + 1;
        int chute = 0;
        int tentativas = 0;

        System.out.println("### BEM-VINDO AO JOGO! ###");
        System.out.println("Pensei em um número de 1 a 100, tente adivinhar!");

        while (chute != numerosecreto) {

            System.out.println("Qual vai ser o seu chute?");
            chute = sc.nextInt();

            tentativas++;

            if (chute < numerosecreto) {
                if (numerosecreto - chute <= 3) {
                    System.out.println("QUASEEE! Chegou bem perto, agora tente um número um pouco maior");
                } else {
                    System.out.println("Xiii, muito baixo! Tente um número maior");
                }
            } else if (chute > numerosecreto) {

                if (chute - numerosecreto <= 3) {
                    System.out.println("QUASEEE! Chegou bem perto, agora tente um numero um pouco menor");
                } else {
                    System.out.println("Xiii, muito alto! Tente um número menor");
                }
            }

        }
        System.out.println("PARABÉNS! Você adivinhou o número secreto " + numerosecreto + " com " + tentativas + " tentativas!");

        sc.close();
    }
}