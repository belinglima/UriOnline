import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome = "LIFE IS NOT A PROBLEM TO BE SOLVED";
        int num = entrada.nextInt();
        System.out.println(nome.substring(0, num));

    }
}