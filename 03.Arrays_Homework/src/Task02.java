import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] array = new int[8];
		int[] newArray = new int[array.length];
		int[] arrayBuffer = new int[newArray.length / 2];
		int reverce = arrayBuffer.length;

		for (int index = 0; index < array.length; index++) {
			array[index] = scanner.nextInt();
		}

		for (int index = 0; index < newArray.length / 2; index++) {
			newArray[index] = array[index];
		}

		for (int index = arrayBuffer.length - 1; index >= 0; index--) {
			arrayBuffer[index] = newArray[index];
		}

		for (int index = 0; index < arrayBuffer.length; index++) {
			System.out.println(arrayBuffer[index]);
		}

		for (int index = newArray.length / 2; index <= newArray.length - 1; index++) {
			newArray[index] = arrayBuffer[reverce - 1];
			reverce--;
		}

		for (int index = 0; index < newArray.length; index++) {
			System.out.print(newArray[index]);
		}

	}

}
