
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int N = readInt();
        while (N-- > 0) {
            String diet = read();
            char[] foods = (read() + read()).toCharArray();
            boolean f = true;
            for (char food : foods) {
                int lengthAux = diet.length();
                diet = diet.replaceFirst(String.valueOf(food), "");
                if (lengthAux == diet.length()) {
                    f = false;
                    break;
                }
            }
            if (f) {
                String[] S = diet.split("");
                Arrays.sort(S);
                for (String si : S) {
                    out.print(si);
                }
                out.println();
            } else {
                out.println("CHEATER");
            }
        }
        out.close();
    }

    private static String read() throws IOException {
        return in.readLine();
    }

    private static int readInt() throws IOException {
        return Integer.parseInt(in.readLine());
    }

}
