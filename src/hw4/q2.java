package hw4;

public class q2 {
	public static void main(String[] args) {
        String s = "Hello World";

        char[] c = s.toCharArray();

        for (int i = c.length-1; i >=0; i--) {
            System.out.print(c[i]);
        }
    }
}
