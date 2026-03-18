import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 1;
        int soma = 0;
        int contador = 0;
        int maior = 0;
        double media = 0;

        System.out.println("Digite os números para acrescentar à soma e digite 0 para parar.");

        while (num != 0) {
            System.out.println("Digite um número: ");
            num = sc.nextInt();

            if (num != 0) {
                soma += num;
                contador++;

                if (num > maior) {
                    maior = num;
                }
            }
        }

        System.out.println("A soma total é: " + soma);
        System.out.println("Você digitou o total de " + (contador) + " números");

        if (contador > 0) {
            media = (double) soma / contador;
            System.out.printf("A média de seus números é: %.2f%n", media);
            System.out.println(maior + " é o maior número!");
        } else {
            System.out.println("Digite um valor maior que 0 para calcular!");
        }


        sc.close();
    }
}
