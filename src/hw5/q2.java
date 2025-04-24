package hw5;

public class q2 {
	 public static void main(String[] args) {
		
		 double avg = randAvg();
		 System.out.println("平均值是：" + avg);
	 }


public static double randAvg() {
	
	int[] numbers = new int[10];
	double total = 0;
	for (int i =0;i<=numbers.length-1;i++) {
		int randInt = (int)(Math.random() * 100) + 1;
		numbers[i]=randInt;
		System.out.print(numbers[i]+" ");
		total = total+numbers[i];
	}
	return total/numbers.length;
}
}
