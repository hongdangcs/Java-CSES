
import java.util.*;
import java.io.*;

public class NumberSpiral {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		long t = Integer.parseInt(br.readLine()), max;
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long i = Integer.parseInt(st.nextToken());// 2
			long j = Integer.parseInt(st.nextToken());// 3

			pw.println(numberSpiral(i, j));
		}
		pw.close();
	}

	private static long numberSpiral(long i, long j) {
		if (i > j) {
			return i % 2 == 0 ? mainCross(i) + (i - j) : mainCross(i) - (i - j);
		}
		return j % 2 == 0 ? mainCross(j) - (j - i) : mainCross(j) + (j - i);
	}

	private static long mainCross(long x) {

		return 1 + (x * (x - 1));
	}
}