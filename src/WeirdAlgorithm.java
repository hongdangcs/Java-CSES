import java.util.Scanner;

public class WeirdAlgorithm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long num = scan.nextLong();

		while (num != 1) {
			System.out.print(num + " ");
			if (num % 2 == 0) {
				num = num / 2;
			} else {
				num = 3 * num + 1;
			}
		}
		System.out.print(num);
	}

}
