import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int n = 0;
    	int v[] = new int[3];
		
		while (n != 4) {
                    n = input.nextInt();
			if (n >= 1 && n <= 3) {
				v[n-1]++;
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + v[0]);
		System.out.println("Gasolina: " + v[1]);
		System.out.println("Diesel: " + v[2]);
    }
}