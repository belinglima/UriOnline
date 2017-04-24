import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
     
        while (entrada.hasNext()) {
             int n = entrada.nextInt();
            int r = n - 1;
            System.out.println(r);
        }
    }
}