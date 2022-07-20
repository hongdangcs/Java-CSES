import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class BitStrings {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		long n = Integer.parseInt(br.readLine()), s = 1;
		for (int i = 0; i < n; i++) {
			s = 2 * s % ((long) 1e9 + 7);
		}
		pw.print(s);
		pw.close();
	}
}
