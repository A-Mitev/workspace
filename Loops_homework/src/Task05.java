import java.util.Scanner;

public class Task05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
			System.out.println(i);
		}
		scanner.close();
	}

}
