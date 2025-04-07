package hw3;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入三角形的三邊長: ");
		String input = scanner.nextLine();
		String[] parts = input.split(" ");
		int a = Integer.parseInt(parts[0]);
		int b = Integer.parseInt(parts[1]);
		int c = Integer.parseInt(parts[2]);
		
		if (isTriangle(a,b,c)) {
			System.out.println("是三角形");
		}else {System.out.println("不是三角");}
		
		if (isRightTriangle(a,b,c)) {
			System.out.println("是直角三角形");
		}else {System.out.println("不是直角三角");}
		
		
		
		
		scanner.close();
		
		
	}


public static boolean isTriangle(int a, int b, int c) {
   
    return (a + b > c) && (a + c > b) && (b + c > a);
}




public static boolean isRightTriangle(int a, int b, int c) {
 
    return (a*a + b*b == c*c) || (a*a + c*c == b*b) || (b*b + c*c == a*a);
}
}