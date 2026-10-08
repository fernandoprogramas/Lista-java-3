import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o número para ver a sequência de Fibonacci: ");
        int numero = sc.nextInt();
        
        System.out.println("Os primeiros " + numero + " numeros da sequência de Fibonacci:");
        
        long fibonacciAtual = 0;
        long fibonacciTermo = 1;

        for (int i = 0; i <= numero; i++) {
            System.out.print(fibonacciAtual + " ");

            long soma = fibonacciAtual + fibonacciTermo;
            fibonacciAtual = fibonacciTermo;
            fibonacciTermo = soma;
        }
    }
}