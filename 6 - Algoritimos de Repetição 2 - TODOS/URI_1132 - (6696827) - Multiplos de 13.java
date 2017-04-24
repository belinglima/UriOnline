import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int x, y, i, s = 0;
		x = input.nextInt();
		y = input.nextInt();
		if (x < y) {
			for (i = x; i <= y; i++) {
				if (i % 13 != 0) {
					s += i;
				}
			}
		} else {
			for (i = y; i <= x; i++) {
				if (i % 13 != 0) {
					s += i;
				}
			}
		}
		System.out.println(s);
    }
}