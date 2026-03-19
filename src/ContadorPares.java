import java.util.Scanner;

public class ContadorPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;

        System.out.println("Dê um número inicial para o contador: ");
        contador = sc.nextInt();

        while (contador >=0) {
            if (contador % 2 == 0) {
                System.out.println(contador + " é par!");
            }
            contador--;
        }

        sc.close();
    }
}
