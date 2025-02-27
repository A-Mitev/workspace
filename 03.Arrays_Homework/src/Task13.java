import java.util.Scanner;

public class Task13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter an integer number!");
		int number = scanner.nextInt();
		System.out.println("The number you entered is " + number + "." + "\n");
		int binary = 0;
		int count = 0;
		while (number > 0) {

			binary += number % 2;
			number /= 2;
			if (number > 0) {
				binary *= 10;
			}
			count++;
		}
		System.out.println("The REVERSED binary representation of the number is " + binary);
		int[] array = new int[count];

		for (int index = 0; index < array.length; index++) {
			array[index] = binary % 10;
			binary /= 10;
		}

		// System.out.println(count);
		System.out.print("The right order representation from the array is    ");
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index]);
		}
	}
}
