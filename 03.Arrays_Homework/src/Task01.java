import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Scanner scanner = new Scanner(System.in);
		
		int[] array = new int [7];
		int smallestNum = Integer.MAX_VALUE;
		
		for (int i = 0; i < array.length; i++) {
			array [i] = scanner.nextInt();
		}
		
		for (int i = 0; i < array.length; i++) {
			if ((array[i] < smallestNum) && (array[i] % 3 == 0)){
				smallestNum = array[i];
			}
		}
		System.out.println(smallestNum);
	}
}
