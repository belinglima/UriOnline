import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int x, y, a;
		x = input.nextInt();
		y= input.nextInt();

		if (x > y) {
			a=x;
			x=y;
			y=a;
		}

		for (int i = x + 1; i < y; i++) {
			if (i % 5 == 2 || i % 5 == 3) {
				System.out.println(i);
			}
		}
    }
}