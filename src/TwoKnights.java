import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TwoKnights {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		long t = Integer.parseInt(br.readLine());
		for (long i = 1; i <= t; i++) {
			long a = i * i * (i * i - 1) / 2;
			if (i > 2) {
				a -= 4 * (i - 1) * (i - 2);
			}
			pw.println(a);

		}
		pw.close();
	}
}
