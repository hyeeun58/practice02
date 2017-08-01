package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) 
	{
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		
		Scanner s = new Scanner(System.in);
		
		// 금액 입력
		System.out.print("금액 : ");
		int getMoney = s.nextInt();
		System.out.println("\n");
		
		int[] countPay = new int[MONEYS.length];
		int remainsPay = getMoney;
		
		// 지폐/동전별 분류
		for(int i=0; i<MONEYS.length; i++)
		{
			countPay[i] = remainsPay/MONEYS[i];
			remainsPay -= MONEYS[i] * countPay[i];
			
			System.out.println(MONEYS[i] + "원 : " + countPay[i] + "개");
		}
 	}
}