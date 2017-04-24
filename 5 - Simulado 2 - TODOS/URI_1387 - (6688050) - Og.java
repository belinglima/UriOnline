import java.io.IOException;
import java.util.Scanner;
 
class Main {
 
    public static void main(String[] args) throws IOException {
      
      Scanner entrada = new Scanner(System.in);
      String line = new String();
      line = entrada.nextLine();
      int sons, daughters;
      if (!line.equals("0 0")){
        do {
          sons = Integer.parseInt(line.split(" ")[0]);
          daughters = Integer.parseInt(line.split(" ")[1]);
          System.out.println(sons+daughters);
          line = entrada.nextLine();
        } while (!line.equals("0 0"));
      }
    }
 
}