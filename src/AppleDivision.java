import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AppleDivision {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine());
		long p[] = new long[n];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			p[i] = Long.parseLong(st.nextToken());

		}

		out.print(minimal(p, 0, 0, p.length));
		br.close();
		out.close();
	}

	public static long minimal(long[] a, long s1, long s2, int n) {

		if (n == 0) {
			return Math.abs(s1 - s2);
		}
		long r1 = minimal(a, s1 + a[n - 1], s2, n - 1);
		long r2 = minimal(a, s1, s2 + a[n - 1], n - 1);
		return Math.min(r1, r2);
	}
}
