import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

public class TrailingZeros {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		long n = Integer.parseInt(br.readLine());
		long count = 0, f = 5;
		while (f <= n) {
			count += n / f;
			f *= 5;
		}
		pw.print(count);
		pw.close();
	}
}