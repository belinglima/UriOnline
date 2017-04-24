import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        int i;
        for (i = 1; i <= 10; i = i + 1) {
            System.out.println(i + " x " + num + " = " + (num * i));
        }
    }

}