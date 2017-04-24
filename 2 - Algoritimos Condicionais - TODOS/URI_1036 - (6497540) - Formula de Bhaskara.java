import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

      Scanner entrada = new Scanner(System.in);
      double A,B,C,DELTA;

      A = entrada.nextDouble();
      B = entrada.nextDouble();
      C = entrada.nextDouble();

      DELTA = Math.pow(B,2) - (4 * A * C);

      if ((A==0) || (DELTA < 0)) {
        System.out.println("Impossivel calcular");
      }

      else {

        double R1 = (((-1 * B) + Math.pow(DELTA, 0.5)) / (2*A));
        double R2 = (((-1 * B) - Math.pow(DELTA, 0.5)) / (2*A));
        System.out.printf("R1 = %.5f\n",R1);
        System.out.printf("R2 = %.5f\n",R2);


      }
    }

}