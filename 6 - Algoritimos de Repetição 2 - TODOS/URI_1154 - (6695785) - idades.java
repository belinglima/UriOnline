import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float count = 0, idade = 0, soma = 0;
        float media = 0;
        while (idade >= 0) {
            idade = entrada.nextInt();
            if (idade >= 0) {
                soma = soma + idade;
            }
            if (idade > 0) {
                count++;
           }
        }
        media = (soma / count);
        System.out.printf("%.2f\n", media);
    }
}
