public class Task18 {
	public static void main(String[] args) {

		int[] firstArray = { 18, 19, 32, 1, 3, 4, 5, 6, 7, 8 };
		int[] secondArray = { 1, 2, 3, 4, 5, 16, 17, 18, 27, 11 };
		int[] thirdArray = new int[secondArray.length];

		for (int i = 0; i < firstArray.length; i++) {
			if (firstArray[i] > secondArray[i]) {
				thirdArray[i] = firstArray[i];
			} else if (firstArray[i] < secondArray[i]) {
				thirdArray[i] = secondArray[i];
			} else {
				thirdArray[i] = firstArray[i];
			}
		}

		for (int i = 0; i < thirdArray.length; i++) {
			if (i == thirdArray.length - 1) {
				System.out.print(firstArray[i]);
				break;
			} else {
				System.out.print(firstArray[i] + ", ");
			}

		}

		System.out.println();
		for (int i = 0; i < thirdArray.length; i++) {
			if (i == thirdArray.length - 1) {
				System.out.print(secondArray[i]);
				break;
			} else {
				System.out.print(secondArray[i] + ", ");
			}

		}

		System.out.println();
		for (int i = 0; i < thirdArray.length; i++) {
			if (i == thirdArray.length - 1) {
				System.out.print(thirdArray[i]);
				break;
			} else {
				System.out.print(thirdArray[i] + ", ");
			}

		}
	}
}
