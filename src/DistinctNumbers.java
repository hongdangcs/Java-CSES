import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class DistinctNumbers {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int q = Integer.parseInt(br.readLine());
		List<Integer> ar = Stream.of(br.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());
		Collections.sort(ar);
		long lst = 0, ans = 0;
		for (int i = 0; i < q; i++) {
			if (ar.get(i) != lst)
				ans++;
			lst = ar.get(i);
		}
		pw.print(ans);
		
		br.close();
		pw.close();
	}
}
