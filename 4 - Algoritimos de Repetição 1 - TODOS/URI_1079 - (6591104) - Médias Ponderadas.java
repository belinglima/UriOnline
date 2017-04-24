import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i;
        int numero = entrada.nextInt();
        for (i = 1; i <= numero; i = i + 1) {
            float nota1 = entrada.nextFloat();
            float nota2 = entrada.nextFloat();
            float nota3 = entrada.nextFloat();
            float result = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
            System.out.printf("%.1f\n", result);

        }

    }

}