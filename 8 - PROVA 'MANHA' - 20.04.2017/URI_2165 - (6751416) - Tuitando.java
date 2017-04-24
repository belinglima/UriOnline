import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
     
        String palavra = entrada.nextLine();
       
        if (palavra.length() > 140) {
            System.out.println("MUTE");
        } else {
            System.out.println("TWEET");
        }

    }

}
