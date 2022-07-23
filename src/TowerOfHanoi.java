
import java.io.*;

class TowerOfHanoi {
	static PrintWriter pw = new PrintWriter(System.out);

	static void towerOfHanoi(long n, char from_rod, char to_rod, char aux_rod) {
		if (n == 0) {
			return;
		}
		towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
		pw.println(from_rod + " " + to_rod);
		towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
	}

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long n = Integer.parseInt(br.readLine());
		pw.println((long)Math.pow(2, n) - 1);
		towerOfHanoi(n, '1', '3', '2');
		pw.close();
	}
}
