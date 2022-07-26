import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class DigitQueries {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		long t = Integer.parseInt(br.readLine());
		StringBuilder str = new StringBuilder();
		for (int i = 1; i < 10000; i++) {
			str.append(i);
		}
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			pw.println(str.charAt(k - 1));
		}
		br.close();
		pw.close();
	}
}
