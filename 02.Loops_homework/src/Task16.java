import java.util.Scanner;

public class Task16 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int firstNum = scanner.nextInt();
		int secondNum = scanner.nextInt();
		
		for (int i = Math.max(firstNum, secondNum); i > Math.min(firstNum, secondNum); i--) {
			if (i % 50 == 0){
				System.out.print(i + ", ");
			} else {
				continue;
			}
		}
	}

}
