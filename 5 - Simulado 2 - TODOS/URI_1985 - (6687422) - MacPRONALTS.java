import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
      Scanner entrada = new Scanner(System.in);
      int number_of_itens = entrada.nextInt();
      int item_id;
      int quantidade;
      double valor = 0;
      for (int i=1;i<=number_of_itens;i++){
        item_id = entrada.nextInt();
        quantidade = entrada.nextInt();
        /**
        1001 | R$ 1.50
        1002 | R$ 2.50
        1003 | R$ 3.50
        1004 | R$ 4.50
        1005 | R$ 5.50
         * */
        if (item_id == 1001){
          valor += 1.5 * quantidade;  
        } else if (item_id == 1002) {
          valor += 2.5 * quantidade;  
        } else if (item_id == 1003) {
          valor += 3.5 * quantidade;  
        } else if (item_id == 1004) {
          valor += 4.5 * quantidade;  
        } else if (item_id == 1005) {
          valor += 5.5 * quantidade;  
        }      
      }
      System.out.printf("%.2f\n",valor);
     }
}
