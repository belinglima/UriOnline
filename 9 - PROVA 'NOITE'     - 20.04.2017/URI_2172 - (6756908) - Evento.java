import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while(true) {
            int nivel = entrada.nextInt();
            int xp = entrada.nextInt();
            if (nivel == 1) {
                int n1 = xp * 1;
                System.out.println(n1);
            }else if (nivel == 2){
                int n2 = xp * 2;
                System.out.println(n2);
            } else if (nivel == 3){
                int n3 = xp * 3;
                System.out.println(n3);
            } else if (nivel == 0)
               break;
        }
    }
}