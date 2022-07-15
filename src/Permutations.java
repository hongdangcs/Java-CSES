import java.util.Scanner;

public class Permutations {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if (n == 1) {
			System.out.println(1);
			return;
		}
		if (n == 2 || n == 3) {
			System.out.println("NO SOLUTION");
			return;
		}

		String s1 = "", s2 = "";

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				s1 += i + " ";
			} else {
				s2 += i + " ";
			}
		}
		System.out.println(s1 + s2);

	}

}
