import java.util.Scanner;

public class Polindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        int original = n, invertido = 0;

        while (n > 0) {
            invertido = invertido * 10 + n % 10;
            n /= 10;
        }

        if (original == invertido)
            System.out.println("É palíndromo");
        else
            System.out.println("Não é palíndromo");

        sc.close();
    }
}