package hw2;

import java.util.Arrays;
import java.util.List;

public class homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
///Q1//////////////////////////////////////////////

		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 1) {
				continue;
			} else {
				sum = sum + i;
			}
		}
		System.out.println(sum);

///Q2//////////////////////////////////////////////

		int sum2 = 1;
		for (int j = 1; j <= 10; j++) {
			sum2 = sum2 * j;

		}
		System.out.println(sum2);

///Q3//////////////////////////////////////////////	

		int k = 1;
		int sum3 = 1;
		while (k <= 10) {
			sum3 *= k;
			k++;
		}
		System.out.println(sum3);
///Q4//////////////////////////////////////////////			

		for (int l = 1; l <= 10; l++) {
			System.out.print((l * l) + " ");
		}
		System.out.println(" ");
///Q5//////////////////////////////////////////////	

		int max = 49;
		int counter = 0;
		List<Character> excludeNumbers = Arrays.asList('4');
		for (int m = 1; m < max; m++) {
			if (shouldExclude(m, excludeNumbers)) {
				continue;
			}
			System.out.print(m + " ");
			counter = counter + 1;
		}
		System.out.print("共" + counter + "個");
		System.out.println(" ");

		/// Q6//////////////////////////////////////////////

		for (int j = 10; j >= 1; j--) { // 從第10列數到第1列
			for (int i = 1; i <= j; i++) { // 每列從1印到當前列數
				System.out.print(i + " ");
			}
			System.out.println(); // 換行
		}
		/// Q7//////////////////////////////////////////////

		for (int i = 0; i < 6; i++) {
			char ch = (char) ('A' + i); // 從 A 開始，每次遞增一個字母
			for (int j = 0; j <= i; j++) {
				System.out.print(ch);
			}
			System.out.println(); // 換行

		}

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
