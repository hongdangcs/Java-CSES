import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;

public class TwoSets {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		long n = Integer.parseInt(br.readLine());
		if ((n * (n + 1) / 2) % 2 == 0) {
			pw.println("YES");
			LinkedList<Long> list = new LinkedList<Long>();
			long half = (n * (n + 1)) / 4;
			while (half > n) {
				list.add(n);
				half -= n;
				n--;
			}
			list.add(half);
			pw.println(list.size());
			while (!list.isEmpty()) {
				pw.print(list.pop() + " ");
			}
			pw.println();
			pw.println(n - 1);
			for (int i = 1; i <= n; i++) {
				if (i == half) {
					continue;
				}
				pw.print(i + " ");
			}
		} else {
			pw.println("NO");
		}
		pw.close();
	}
}
