package hw2;

public class homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
///Q1//////////////////////////////////////////////
		int i = 0;
		int sum = 0;
		for (i = 1; i <= 1000; i++) {
			if (i % 2 == 1) {
				continue;
			} else {
				sum = sum + i;
			}
		}
		System.out.println(sum);

///Q2//////////////////////////////////////////////
		int j = 0;
		int sum2 = 1;
		for (j = 1; j <= 10; j++) {
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
		int l = 1;
		for (l=1;l<=10;l++) {
			System.out.print((l*l)+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
