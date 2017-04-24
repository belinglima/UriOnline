import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
 		Scanner input = new Scanner(System.in);
		int n, fat = 1;
		n = input.nextInt();
		while (n > 0) {
			fat = fat*n;
			n -= 1;
		}
		System.out.println(fat);
    }
}