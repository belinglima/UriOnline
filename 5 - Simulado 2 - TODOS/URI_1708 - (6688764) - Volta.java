import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = b / (b - a);

        System.out.println(b % (b - a) == 0 ? c : c + 1);

    }
}