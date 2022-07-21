import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class GrayCode {

	static PrintWriter pw = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Integer.parseInt(br.readLine());
		boolean[] used = new boolean[1 << n];
        StringBuilder b = new StringBuilder();
        int start = 0;
        while(true){
            if(used[start]) break;
            used[start] = true;
            String s = Integer.toBinaryString(start);
            long diff = n - s.length();
            for(int i = 0; i < diff; i++){
                b.append('0');
            }
            b.append(s);
            b.append("\n");
            for(int i = 0; i < n; i++){
                int next = start ^ (1 << i);
                if(!used[next]){
                    start = next;
                    break;
                }
            }
        }
        pw.print(b);
		pw.close();

	}

	public static void printZero(long n) {

	}
}