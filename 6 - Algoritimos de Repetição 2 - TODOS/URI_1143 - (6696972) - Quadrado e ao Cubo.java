import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int n, i;
		n = input.nextInt();

		for (i=1; i <= n; i++) {
			System.out.print(i + " ");
			System.out.print(i*i + " ");
			System.out.println(i*i*i);
	}
    }
}