package hw1;

public class Homework1 {
	public static void main(String[] args) {
///Q1//////////////////////////////////////////////
		int a =12;
		int b = 6;
		System.out.println((a+b)+" "+(a*b));
///Q2/////////////////////////////////////////////
		int egg = 200;
		
		System.out.println(egg/12+"打"+ egg%12+"顆");
///Q3/////////////////////////////////////////////
		int d0 = 256559;
		int d1 = d0/(60*60*24);
		int d2 = (d0%(60*60*24))/(60*60);
		int d3 = ((d0%(60*60*24))%(60*60))/60;
		int d4 = ((d0%(60*60*24))%(60*60))%60;
		
		
		System.out.println("共為"+d1+"天"+d2+"時"+d3+"分"+d4+"秒");
///Q4/////////////////////////////////////////////////
		final double pi= 3.1415;
		System.out.println("Area="+5*5*pi+"cm^2"+"parimeter="+5*2*pi+"cm");
///Q5/////////////////////////////////////////////////
		////FV ＝ PV×（1 ＋ R）n 次方///
		double money = 1500000;
		double rate = 1+0.02;
		double total =money*Math.pow((double)(rate), 10);
		System.out.println(total+"元");
///Q6///////////////////////////////////////////////////////
		System.out.println(5+5+"純數學計算");
		System.out.println(5+'5'+"5的字元值為053,053+5=58");
		System.out.println(5+"5"+"後面的5是字串所以是55字串拼接");
	}
}
