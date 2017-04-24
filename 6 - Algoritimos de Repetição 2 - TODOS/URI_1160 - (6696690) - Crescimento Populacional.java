import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int n, c, a, b;
    	double ac, bc;
		n = input.nextInt();
		while (n > 0) {
			c=0;
			a = input.nextInt();
			b = input.nextInt();
			ac = input.nextDouble();
			bc = input.nextDouble();
			while (a <= b) {
				a *= (ac / 100.0) + 1.0;
				b *= (bc / 100.0) + 1.0;
				c++;
				if (c>100) {
					System.out.println("Mais de 1 seculo.");
					break;
				}
			}
			if (c <= 100) {
				System.out.println(c + " anos.");
			}
			n--;
		}
    }
}