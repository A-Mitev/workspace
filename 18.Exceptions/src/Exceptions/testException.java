package Exceptions;

public class testException {

	static void printArrayInfo(int[] array) throws MyExceptionException {
		try {
			System.out.println(array.length);
			System.out.println(array[3]);
			System.out.println("Printiram neshto si");
		} catch (NullPointerException out) {
			throw new MyExceptionException("testvam si moqta", out);
		}

	}

	public static void main(String[] args) {

		int[] array = null;
		try {
			printArrayInfo(array);
		} catch (MyExceptionException e) {
			System.out.println("Tova e Stack Trasa za info:");
			e.printStackTrace();
		}
	}

}
