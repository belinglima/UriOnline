import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        int min = 21, r = 0;

        for (int i = 1; i <= num; i++) {
            int n = entrada.nextInt();

            if (min > n) {
                min = n;
                r = i;
            }
        }
        System.out.println(r);
    }
}