import java.util.Scanner;

public class Simple_Task_3 {

	static boolean isPrime(int input) {
		for (int index = 2; index < input; index++) {
			if (input % index == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int input = scanner.nextInt();

		if (isPrime(input)) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}
}
