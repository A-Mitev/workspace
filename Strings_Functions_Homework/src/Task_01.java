import java.util.Scanner;

public class Task_01 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		String firstInput = scanner.next();
		String secondInput = scanner.next();
		
		while((firstInput.length() > 40) || (secondInput.length() > 40)){
			System.out.println("Please enter test up to 40 symbols!");
			firstInput = scanner.next();
			secondInput = scanner.next();
		}
		
		System.out.print(firstInput.toUpperCase()
					+ " " + firstInput.toLowerCase()								 
						+ " " + secondInput.toUpperCase()								  
							+ " " + secondInput.toLowerCase());
	}
}
