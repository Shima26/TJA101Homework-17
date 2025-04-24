package hw5;

public class q3method {
	public static int maxElement(int x[][]) {
	    int max = x[0][0];  // 先假設第一個元素是最大值

	    for (int i = 0; i < x.length; i++) {
	        for (int j = 0; j < x[i].length; j++) {
	            if (x[i][j] > max) {
	                max = x[i][j];
	            }
	        }
	    }

	    return max;
	}
	public static double maxElement(double x[][]) {
	    double max = x[0][0];  // 先假設第一個元素是最大值

	    for (int i = 0; i < x.length; i++) {
	        for (int j = 0; j < x[i].length; j++) {
	            if (x[i][j] > max) {
	                max = x[i][j];
	            }
	        }
	    }

	    return max;
	}
}
