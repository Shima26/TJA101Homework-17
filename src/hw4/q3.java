package hw4;

public class q3 {
	 public static void main(String[] args) {
	     int count = 0;   
		 String[] s ={"mercury", "venus", "earth", "mars", "upiter","saturn", "uranus", "neptune"}; 
	               for (String word : s) { // 逐一取出陣列中的每個字
	                char[] chars = word.toCharArray(); // 將字串轉成 char 陣列
	                for (char ch : chars) {
	                    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                    	count=count+1;
	                    }
	                }
	            }
	               System.out.println("母音字母總數: " + count);
	        }         
	       	       	      
}
