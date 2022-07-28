import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class DigitQueries {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int q = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder(3 * q);
		long loc, dec, ten, prod, num, loc1;
		int mod;
		for (int i = 0; i < q; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			loc = Long.parseLong(st.nextToken());
			if (loc <= 9) {
				sb.append(loc);
			} else {
				dec = 1;
				ten = 1;
				prod = 9;
				while (prod < loc) {
					loc -= prod;

					dec++;
					ten *= 10;
					prod = 9 * dec * ten;
				}

				loc1 = loc - 1;
				num = ten + ((loc1) / dec);
				mod = (int) ((loc1) % dec);
				sb.append(String.valueOf(num).charAt(mod));
			}
			sb.append("\n");
		}

		pw.print(sb);
		br.close();
		pw.close();
	}
}
