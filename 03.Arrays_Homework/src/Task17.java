import java.util.Scanner;

public class Task17 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int arraySize = scanner.nextInt();
		int[] array = new int[arraySize];

		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		boolean nazubenNagore = true;

		if ((array[0] < array[0 + 1])) {
			nazubenNagore = true;
		} else {
			nazubenNagore = false;
		}

		if (nazubenNagore) {
			for (int i = 1; i <= array.length; i += 2) {
				if (i == array.length) {
					break;
				}
				if (array.length % 2 == 0 && i == array.length - 1) {
					if (array[i] > array[i - 1]) {
						nazubenNagore = true;
						break;
					} else {
						nazubenNagore = false;
						break;
					}
				}

				if ((array[i - 1] < array[i]) && (array[i] > array[i + 1])) {
					nazubenNagore = true;
				} else {
					nazubenNagore = false;
					break;
				}
			}
		}

		if (!nazubenNagore) {
			System.out.println("Ne izpulnqva iziskvaniqta za zigzagoobrazna nagore rediza !");
		} else {
			System.out.println("Izpulnqva iziskvaniqta za zigzagoobrazna nagore rediza !");
		}
	}
}
