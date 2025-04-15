package hw4;

public class q1 {
	 public static void main(String[] args) {
	        double[] num ={29, 100, 39, 41, 50, 8, 66, 77, 95, 15}; 
	        double sum = 0;
	        double avg = 0;
	        
	      
	        for(int i = 0; i < num.length; i++) {
	            sum=sum+num[i];
	            
	        }
	       avg=sum/num.length;
	       System.out.println("平均是"+avg);
	       System.out.println("大於平均的有:");
	      for(int i = 0; i < num.length; i++) {
	    	  if(num[i]>avg) {
	    		  int intNum = (int) num[i];
	    		  System.out.print(intNum+" ");
	    	  }
	    	  
	    	  
	      }
	      
	    }

}
