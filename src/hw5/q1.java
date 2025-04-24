package hw5;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入寬和高");
		int width = scanner.nextInt();
		int height = scanner.nextInt();
		q1method.starSquare(width, height);
		 scanner.close();
	}


	
}
