package hw5;
public class q3 {
	public static void main(String[] args) {
		int[][] intArray= {{1,6,3},{9,5,2}};
		double[][] doubleArray = {{1.2,3.5,2.2},{7.4,2.1,8.2}};
		q3method w = new q3method();
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));
	}

	

}
