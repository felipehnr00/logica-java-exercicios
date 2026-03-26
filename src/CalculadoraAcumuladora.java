import java.util.Scanner;

public class CalculadoraAcumuladora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;
        int opcao;

        System.out.println("Bem-vindo à Calculadora Interativa");

        do {
            System.out.println("Total atual: " + total);
            System.out.println("1 - Somar um número");
            System.out.println("2 - Subtrair um número");
            System.out.println("0 - Sair e ver resultado final");
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Digite o valor para somar: ");
                int valor = sc.nextInt();
                total += valor;
            } else if (opcao == 2) {
                System.out.println("Digite o valor para subtrair: ");
                int valor = sc.nextInt();
                total -= valor;
            } else if (opcao != 0) {
                System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        System.out.println("Resultado final: " + total);
        System.out.println("Programa encerrado!");

        sc.close();
    }
}
