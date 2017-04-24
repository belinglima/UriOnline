import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int N;
		N = input.nextInt();

		for (int i=1; i <= N*4; i+=4) {
			System.out.print(i + " ");
			System.out.print(i+1 + " ");
			System.out.print(i+2 + " ");
			System.out.println("PUM");
		}
    }
}