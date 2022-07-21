import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class GrayCode {

	static PrintWriter pw = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long t = Integer.parseInt(br.readLine());
		grayCodes(t);
		pw.close();

	}

	public static void grayCodes(long n) {
		if(n==0) {
			pw.println();
			return;
		}
		pw.print("0");
		pw.print("1");
		grayCodes(n-1);
		
	}
	public static void printZero(long n) {
		
	}
}