import java.util.Scanner;

public class Task08 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int i = 0; i < n * 2; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print((i + n) - 1);

			}
			System.out.println();
			i += 1;

		}
	}

}
