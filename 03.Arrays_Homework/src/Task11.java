import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int size = 7;
		int[] array = new int[size];

		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 5 == 0) {
				if (array[i] > 5) {
					if (count > 0){                         // dava mi vuzmoznost da ne izkaram rezult
						System.out.print(", ");             // pri kojto nqma zapetaq sled poslednata cifra
					}                                       // nezavisimo dali e posledna v masiva ili ne
					count++;
					System.out.print(array[i]);
				}
			}
		}
		System.out.print(" - " + count + " numbers");
	}

}
