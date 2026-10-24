import java.util.Scanner;

public class NumeroPrimoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int num = 2; num <= n; num++) {
            boolean primo = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) System.out.print(num + " ");
        }
        sc.close();
    }
}