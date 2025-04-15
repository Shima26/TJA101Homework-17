package hw4;

import java.util.Scanner;

public class q4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入想借的金額:");
		int money = scanner.nextInt();
		int[][] matrix = {
			    {25, 32, 8, 19, 27},
			    {2500, 800, 500, 1000, 1200}
			};
		for (int i = 0; i < matrix[0].length; i++) {
			if(matrix[1][i]>=money) {
				System.out.print(matrix[0][i]+" ");
			}
		}
		
		scanner.close();
		
		
		
	}

}
