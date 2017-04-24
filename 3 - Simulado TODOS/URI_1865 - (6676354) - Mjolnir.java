import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        int num = entrada.nextInt(), x;
        for (int i = 0; i < num; i++) {
            nome = entrada.next();
            x = entrada.nextInt();

            if (nome.equals("Thor")) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }

        }

    }
}