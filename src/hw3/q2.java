package hw3;

import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {
        
        // 隨機產生1到10的數字
        int i = (int) (Math.random() * 10) + 1;
        
        // 創建Scanner物件以讀取使用者輸入
        Scanner scanner = new Scanner(System.in);
        
        int a = 0;
        boolean guessedCorrectly = false;  // 用來標記是否猜對
        
        // 持續讓使用者猜直到猜對
        while (!guessedCorrectly) {
            System.out.println("請輸入您猜的數字（1到10）");
            a = scanner.nextInt();
            
            if (a == i) {
                System.out.println("答對了!");
                guessedCorrectly = true;  // 猜對了，跳出循環
            } else {
                System.out.println("猜錯了，請再試一次!");
            }
        }
        
        // 關閉Scanner
        scanner.close();
    }
}
