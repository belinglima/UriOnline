import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double number = entrada.nextDouble();
        double resultado = (Math.pow((1+Math.pow(5, 0.5)) / 2,number) - Math.pow((1-Math.pow(5, 0.5)) / 2,number)) / Math.pow(5,0.5);
        System.out.printf("%.1f\n",resultado);
        
    }
    
}