import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        int result = 24+(a + b + c)% 24;
        int s = result % 24;

        if (result == 24) {
            System.out.println(0);
        } else {
            System.out.println(s);
        }
    }
}