package hw5;

import java.util.Random;

public class q5method {
	
		public static String genAuthCode() {
	        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        StringBuilder authCode = new StringBuilder();
	        Random random = new Random();
	        
	        for (int i = 0; i < 8; i++) {
	            int index = random.nextInt(chars.length());
	            authCode.append(chars.charAt(index));
	        }
	        
	        return authCode.toString();
	    }
	}