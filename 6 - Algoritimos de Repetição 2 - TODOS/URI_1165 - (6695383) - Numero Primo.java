import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        int n, cont;
        for (int j = 0; j < numero; j++) {
            n = entrada.nextInt();
            cont = 0;
            for (int i = 1; i <= n; i++) {
                if ((n % i) == 0) {
                    cont++;
                }
            }
            if (cont >= 1 && cont <= 2) {
                System.out.println(n + " eh primo");
            } else {
                System.out.println(n + " nao eh primo");
            }
        }

    }
}
