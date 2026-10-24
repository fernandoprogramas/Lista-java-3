import java.util.Scanner;

public class NumeroInvertido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        int invertido = 0;

        while (n != 0) {
            invertido = invertido * 10 + n % 10;
            n /= 10;
        }

        System.out.println("Número invertido: " + invertido);
        sc.close();
    }
}