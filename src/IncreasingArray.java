import java.util.Scanner;

public class IncreasingArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextInt();
		long a, pre = 0;
		long count = 0;
		for (int i = 0; i < n; i++) {
			a = scan.nextLong();
			if (i > 0) {

				if (a < pre) {
					count += (pre - a);
					a = pre;
				}

			}
			pre = a;
		}
		System.out.println(count);
	}

}
