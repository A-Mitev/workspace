import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int input = scanner.nextInt();
		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			if (i < 2) {
				array[i] = input;
			} else {
				array[i] = (array[i - 1] + array[i - 2]);
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (i < array.length - 1) {
				System.out.print(array[i] + ", ");
			}
			if (i == array.length - 1) {
				System.out.print(array[i]);
			}
		}
	}
}
