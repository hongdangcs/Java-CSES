
import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextInt();

		long a;
		long sum = 0;
		for (int i = 0; i < n - 1; i++) {
			a = scan.nextInt();
			sum += a;
		}
		System.out.println((n * (n + 1)) / 2 - sum);
	}

}
