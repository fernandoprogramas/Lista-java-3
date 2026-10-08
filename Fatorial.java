import java.util.Scanner;

public class fatorial
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int fatorial = 1;
	    
		System.out.print("Digite um número para calcular o seu fatorial: ");
		int numero = sc.nextInt();
		
		for (int i = numero; i > 0; i--) {
		    fatorial = fatorial * i;
		}
		System.out.print("O fatorial de " + numero + " é " + fatorial);
	}
}
