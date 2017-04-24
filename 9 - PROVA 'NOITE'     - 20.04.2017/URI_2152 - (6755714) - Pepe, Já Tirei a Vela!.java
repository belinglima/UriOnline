import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();

        for (int i = 0; i < num; i++) {
            int a = entrada.nextInt();
            int b = entrada.nextInt();
            int c = entrada.nextInt();

            if (c == 1) {
                System.out.printf("%02d:%02d - A porta abriu!\n",a ,b);
            } else {
                System.out.printf("%02d:%02d - A porta fechou!\n",a ,b);
            }
        }
    }
}