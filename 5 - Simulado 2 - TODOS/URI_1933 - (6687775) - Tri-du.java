import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        if (n1 == n2) {
            System.out.println(n1);
        } else {
            System.out.println(Math.max(n1, n2));
        }

    }

}