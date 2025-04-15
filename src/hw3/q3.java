package hw3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		int max = 49;
		int counter = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入想要迴避的數字");
		int a = scanner.nextInt();
		char b = (char) ('0' + a); 
		List<Character> excludeNumbers = Arrays.asList(b);
		for (int m = 1; m < max; m++) {
			if (shouldExclude(m, excludeNumbers)) {
				continue;
			}
			System.out.print(m + " ");
			counter = counter + 1;
		}
		System.out.print("共" + counter + "個");
		System.out.println(" ");

	}


public static boolean shouldExclude(int number, List<Character> excludeNumbers) {
	String numStr = String.valueOf(number);
	for (char ch : excludeNumbers) {
		if (numStr.indexOf(ch) >= 0) {
			return true;
		}
	}

	return false;

}

}