import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CoinPiles {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		long t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long i = Integer.parseInt(st.nextToken());
			long j = Integer.parseInt(st.nextToken());

			if (i > j) {
				long k = i - j;
				i -= 2 * k;
				j -= k;
			} else {
				long k = j - i;
				i -= k;
				j -= 2 * k;
			}
			if (i == j && i % 3 == 0 && i >= 0) {
				pw.println("YES");

			} else
				pw.println("NO");
		}
		pw.close();
	}
}