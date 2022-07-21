import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class PalindromeReorder {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String s = br.readLine();
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		int count=0;
		for(int i = 0; i<arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				i++;
			}else {
				count++;
			}
		}
		pw.print(count+ String.valueOf(arr));
		pw.close();
	}

	static String sortString(String str) {
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		return (String.valueOf(arr));
	}
}
