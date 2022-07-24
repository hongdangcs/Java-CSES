import java.io.*;
import java.util.*;

public class CreatingStrings {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);

		String str = br.readLine();
		char[] input = str.toCharArray();
		StringBuilder output = new StringBuilder();
		int ans = 0;

		Arrays.sort(input);
		do {
			output.append(input).append('\n');
			ans++;
		} while (nextPermutation(input));

		out.println(ans);
		out.print(output);

		out.close();
	}

	static boolean nextPermutation(char[] perm) {
		for (int i = perm.length - 2; i >= 0; i--) {
			if (perm[i] < perm[i + 1]) {
				for (int j = perm.length - 1;; j--) {
					if (perm[j] > perm[i]) {
						{
							char swapTemp = perm[i];
							perm[i] = perm[j];
							perm[j] = swapTemp;
						}
						for (i++, j = perm.length - 1; i < j; i++, j--) {
							{
								char swapTemp = perm[i];
								perm[i] = perm[j];
								perm[j] = swapTemp;
							}
						}
						return true;
					}
				}
			}
		}
		return false;
	}

}