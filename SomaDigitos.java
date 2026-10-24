import java.util.Scanner;

public class SomaDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = Math.abs(sc.nextInt());
        int soma = 0;

        while (n > 0) {
            soma += n % 10;
            n /= 10;
        }

        System.out.println("Soma dos dígitos: " + soma);
        sc.close();
    }
}