import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class GrayCode {

	static FastScanner in = new FastScanner();
    static FastWriter pw = new FastWriter();

	public static void main(String[] args) throws IOException {
		long n = in.nextLong();
		boolean[] used = new boolean[1 << n];
		StringBuilder b = new StringBuilder();
		int start = 0;
		while (true) {
			if (used[start])
				break;
			used[start] = true;
			String s = Integer.toBinaryString(start);
			long diff = n - s.length();
			for (int i = 0; i < diff; i++) {
				b.append('0');
			}
			b.append(s);
			b.append("\n");
			for (int i = 0; i < n; i++) {
				int next = start ^ (1 << i);
				if (!used[next]) {
					start = next;
					break;
				}
			}
		}
		pw.print(b);
		pw.close();

	}

	static class FastScanner {
		BufferedReader reader;
		StringTokenizer tokenizer;

		public FastScanner() {
			reader = new BufferedReader(new InputStreamReader(System.in));
			tokenizer = new StringTokenizer("");
		}

		String next() {
			while (!tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return tokenizer.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String string = "";
			try {
				string = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return string;
		}
	}

	/* Fast output writer */
	static class FastWriter {
		PrintWriter writer;

		public FastWriter() {
			writer = new PrintWriter(new BufferedOutputStream(System.out));
		}

		<T> FastWriter print(T x) {
			writer.print(x);
			return this;
		}

		<T> FastWriter printArray(T[] x) {
			for (int i = 0; i < x.length; i++) {
				// if(i > 0) writer.print(separator);
				writer.print(x[i]);
			}
			return this;
		}

		FastWriter endLine() {
			writer.println();
			return this;
		}

		void close() {
			writer.close();
		}
	}
}