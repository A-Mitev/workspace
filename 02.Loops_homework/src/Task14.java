import java.util.Scanner;

public class Task14 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		while (!((input > 9) && (input < 201))){
			System.out.println("Please enter number between 10 and 200!");
			input = scanner.nextInt();
		}
		
		for (int i = 200; i > 0; i--) {
			if ((i % 7 == 0) &&(i < input)){
				System.out.print(i + ", ");
			} else {
				continue;
			}
		}
		
	}

}
