package hw5;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入寬和高");
		int width = scanner.nextInt();
		int height = scanner.nextInt();
		starSquare(width,height);
		 scanner.close();
	}


	public static void starSquare(int width, int height) {
		
		for(int i=0;i<height;i++) {
			for(int j=0;j<width;j++) {
				
				System.out.print("*");
			}
			System.out.println("*");
		}
		
	}
}
