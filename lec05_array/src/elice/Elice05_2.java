package elice;

import java.util.Scanner;

public class Elice05_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] coin = { 500, 100, 50, 10, 5, 1 };
		int[] cnt = { 5, 5, 5, 5, 5, 5 };
		int[] cnt2 = { 5, 5, 5, 5, 5, 5 };
		int money = 0;

		for (int i = 0; i < coin.length; i++) {
			money += coin[i] * cnt[i];
		}

		if (num > money) {
			System.out.println("동전이 부족합니다.");
		} else {

			for(int i = 0; i < coin.length; i++) {
				int use = 0;
				if(num / coin[i] > cnt[i]) {
					use = cnt[i];
					num -= use*coin[i];
					cnt[i] -= use;
				} else {
					use = num / coin[i];
					num -= use*coin[i];
					cnt[i] -= use;
				}
				
			}
		}
		for(int i = 0; i < coin.length; i++) {
			System.out.println(coin[i] + "원" + (cnt2[i] - cnt[i]));
			
		}
	}
}
