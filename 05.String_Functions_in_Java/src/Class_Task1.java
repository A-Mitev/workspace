public class Class_Task1 {
	
	static void printArray(int[] array){
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		
		printArray(array);
		
	}
}