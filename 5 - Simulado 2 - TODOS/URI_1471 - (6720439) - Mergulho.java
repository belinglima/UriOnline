import java.io.*;
import java.util.*;
import java.math.*;
import java.text.*;
public class Main {
	public static int[] parseInts(String line) {
		String lines[] = line.split(" ");
		int n = lines.length;
		int r[] = new int[n];
		for (int i = 0; i < n; i++) {
			r[i] = Integer.parseInt(lines[i]);
		}
		return r;
	}
public static void main(String[] args) throws IOException {
	BufferedReader in;
	StringBuilder out = new StringBuilder();
	File file = new File("in");
	if (file.exists())
		in = new BufferedReader(new FileReader(file));
	else
		in = new BufferedReader(new InputStreamReader(System.in));
	String line, lines[];
	int n, r, arr[], t[];
	String s;
	while ((line = in.readLine()) != null) {
		lines = line.split(" ");
		n = Integer.parseInt(lines[0]);
		r = Integer.parseInt(lines[1]);
		arr = parseInts(in.readLine());
		t = new int[n+1];
		s = "";
		for ( int i =0; i < arr.length; i++ ) t[arr[i]]++;
		for ( int i =1; i <= n; i++ ) if ( t[i] == 0) s += i+" ";
		if ( s.equals("")) out.append("*\n");
		else out.append(s+"\n");
	}
	System.out.print(out);
}
}