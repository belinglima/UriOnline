import java.io.IOException;
import java.util.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
      int caw_count = 0;
      Scanner entrada = new Scanner(System.in);
      String linha = new String();
      int numero = 0;
      for (int i=1;i<=3;) {
        linha = entrada.nextLine();
        if (linha.equals("caw caw")){
          System.out.println(numero);
          numero = 0;
          i++;
        } else {
          if ('*' == linha.charAt(0)) {
            numero += 4;
          };
          if ('*' == linha.charAt(1)) {
            numero += 2;
          };
          if ('*' == linha.charAt(2)) {
            numero += 1;
          };
        }
      };
    }
 }
