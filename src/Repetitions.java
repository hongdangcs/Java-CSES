import java.util.Scanner;

public class Repetitions {

	public static int longestRepetition(String s) {
		if (s.length() == 1) {
			return 1;
		}
		int m = 1, n = 1;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				m++;
				if (m > n) {
					n = m;
				}
			} else {
				m = 1;
			}
		}
		return n;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();

		System.out.println(longestRepetition(a));
	}

}
