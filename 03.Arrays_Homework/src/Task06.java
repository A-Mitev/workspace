import java.util.Scanner;

public class Task06 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter first array size.");
		int[] firstArray = new int[scanner.nextInt()];
		System.out.println("Please enter second array size.");
		int[] secondArray = new int[scanner.nextInt()];
		boolean equal = false;
		boolean sameSize = false;
		System.out.println("Please enter first array digits.");
		for (int i = 0; i < firstArray.length; i++) {
			firstArray[i] = scanner.nextInt();
		}
		System.out.println("Please enter second array digits.");
		for (int i = 0; i < secondArray.length; i++) {
			secondArray[i] = scanner.nextInt();
		}
		
		if ((firstArray.length > secondArray.length) ||
				(firstArray.length == secondArray.length)){
			
			for (int i = 0; i < firstArray.length; i++) {
				if (firstArray[i] == secondArray[i]){
					equal = true;
				} else {
					equal = false;
				}
			}
		}
		
		if (secondArray.length > firstArray.length){
			for (int i = 0; i < secondArray.length; i++) {
				if (secondArray[i] == firstArray[i]){
					equal = true;
				} else {
					equal = false;
				}
			}
		}
		
		if (firstArray.length == secondArray.length){
			sameSize = true;
		}
		System.out.println("Are these arrays equal? " + equal);
		System.out.println("Are they have same size? " + sameSize);
		
	}

}
