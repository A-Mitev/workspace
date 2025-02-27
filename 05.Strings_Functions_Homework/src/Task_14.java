import java.util.Scanner;

public class Task_14 {

	static int calculateFactioial(int userInput) {
		int factorial = 1;
		for (int index = 1; index <= userInput; index++) {
			factorial *= index;
		}
		return factorial;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter a digit between 1 and 33 for Factorial calculation.");
		int userInput = scanner.nextInt();

		if (userInput <= 0) {
			System.out.println("Factorial of zero or negative number is always = \"1\"!");
		}
		if (userInput >= 34) {
			System.out.println("Factorial of 34 or larger ìs always 0 because of integer overflow!");
		}
		System.out.println("\n" + "Factorial of " + userInput + " = " + calculateFactioial(userInput));
		
		scanner.close();
	}

}
