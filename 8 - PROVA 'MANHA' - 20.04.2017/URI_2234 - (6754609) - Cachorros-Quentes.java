import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);
  double a, b, media;
  a = entrada.nextDouble();
  b = entrada.nextDouble();
  media = a/b;
  System.out.printf("%.2f" + "\n",media);
 }
}