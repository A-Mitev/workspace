import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		for (int i = 1; i < num + 1; i++) {
			for (int j = 0; j < num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i * 2) - 1 ; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
}
