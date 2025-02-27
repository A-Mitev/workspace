import java.util.Scanner;

public class Class_Task_Homework {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int rows = scanner.nextInt();
		int cols = scanner.nextInt();

		int a[][] = new int[rows][cols];
		int num = 1;

		for (int r1 = 0; r1 < rows; r1++) {
			int r = r1, c = 0;

			//fills one diagonal
			while (r >= 0 && c < cols) {
				a[r][c] = num;
				if (r == 0){
					num++;
					r--;
					c++;	
				} else if ((r > 0) || r % 2 != 0) {
					num += (r + 2);
					num--;
					r--;
					c++;
				} else {
					num++;
					r--;
					c++;	
				}
				
			}
		}
		
		for (int c1 = 1; c1 < cols; c1++) {
			int r = rows-1, c = c1;
			
			//fills one diagonal
			while (r >= 0 && c < cols) {
				a[r][c] = num;
				num++;
				r--;
				c++;
			}
		}
		
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[0].length; col++) {
				System.out.print(a[row][col] + " ");
			}
			System.out.println();
		}
	}
}