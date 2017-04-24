import java.io.IOException;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException {

  

       int X, Y;

        Scanner input =new Scanner(System.in);

         

        while (((X = input.nextInt()) > 0 )&&((Y = input.nextInt()) > 0 )) {

            int sum = 0;

            if (X > Y) {

                for (Y = Y; Y <= X; Y++) {

                    sum+=Y;

                    System.out.print(Y+" ");

                }

                System.out.print("Sum="+sum+"\n");

            }else {

                for (X = X; X <= Y; X++) {

                    sum+=X;

                    System.out.print(X+" ");

                }

                System.out.print("Sum="+sum+"\n");

            }

        }

  

    }

  

}
