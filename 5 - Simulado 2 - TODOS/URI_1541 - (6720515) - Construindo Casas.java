import java.io.*;
import java.util.*;
import java.math.*;
public class Main {
public static void main(String[] args) throws IOException {
	BufferedReader in;
	StringBuilder out = new StringBuilder();
	File file = new File("in");
	if (file.exists())
		in = new BufferedReader(new FileReader(file));
	else
		in = new BufferedReader(new InputStreamReader(System.in));
	String line, lines[];
	while ((line = in.readLine()) != null && !line.equals("0")) {
		double x, p, r;
	    lines = line.split("\\s+");
	    x = Integer.parseInt(lines[0])*Integer.parseInt(lines[1]);
	    p = Integer.parseInt(lines[2]);
	    r = Math.sqrt(x+((x*(100-p))/p));
		System.out.println((int)r);
	}
}
}