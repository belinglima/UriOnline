import java.io.IOException;
import java.util.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
      
      Scanner entrada = new Scanner(System.in);
      
      int cases = entrada.nextInt();
      String line;
      char current_char;
      int leds;
      
      for (int i=0;i<=cases;i++){
        line = entrada.nextLine();
        leds = 0;
        if (i==0){
          continue;
        }
        for (int j=0;j<line.length();j++){
          if (line.charAt(j) == '1'){
            leds += 2;
          }
          else if (line.charAt(j) == '2'){
            leds += 5;
          }
          else if (line.charAt(j) == '3'){
            leds += 5;
          }
          else if (line.charAt(j) == '4'){
            leds += 4;
          }
          else if (line.charAt(j) == '5'){
            leds += 5;
          }
          else if (line.charAt(j) == '6'){
            leds += 6;
          }
          else if (line.charAt(j) == '7'){
            leds += 3;
          }
          else if (line.charAt(j) == '8'){
            leds += 7;
          }
          else if (line.charAt(j) == '9'){
            leds += 6;
          }
          else if (line.charAt(j) == '0'){
            leds += 6;
          };
        }
        System.out.println(leds + " leds");
      }
    }
 
}
