import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Permutations {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		PrintStream printStream = new PrintStream(System.out);

		int n = Integer.parseInt(reader.readLine());
		if (n == 1) {
			printStream.print("1");
			return;
		}

		if (n == 2 || n == 3) {
			printStream.print("NO SOLUTION");
			return;
		}

		StringBuilder s = new StringBuilder();

		if (n % 2 == 0) {
			for (int i = 2; i <= n; i += 2) {
				s.append(i).append(" ");
			}
			for (int i = 1; i < n; i += 2) {
				s.append(i).append(" ");
			}
		} else {
			for (int i = n; i > 0; i -= 2) {
				s.append(i).append(" ");
			}
			for (int i = n - 1; i > 0; i -= 2) {
				s.append(i).append(" ");
			}
		}

		printStream.print(s.toString());
	}
}