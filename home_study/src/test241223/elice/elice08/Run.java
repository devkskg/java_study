package test241223.elice.elice08;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		int[] coin = { 500, 100, 50, 10, 5, 1 };
		int[] cnt = { 5, 5, 5, 5, 5, 5 };
		int[] origin = new int[cnt.length];
		System.arraycopy(cnt, 0, origin, 0, origin.length);

		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();

		int havemoney = 0;
		for (int i = 0; i < coin.length; i++) {
			havemoney += coin[i] * cnt[i];
		}
//		System.out.println(havemoney);

		if (money <= havemoney) {
			
			for (int i = 0; i < coin.length; i++) {
				int use = 0;
				if (money / coin[i] < cnt[i]) {
					use = money / coin[i];
					money -= use * coin[i];
					cnt[i] -= use;
				} else if (money / coin[i] >= cnt[i]) {
					use = cnt[i];
					money -= use * coin[i];
					cnt[i] -= use;
				}

			}
			
			for (int i = 0; i < coin.length; i++) {
				System.out.println(coin[i] + "원:" + (origin[i] - cnt[i]));
			}
			
			for (int i = 0; i < coin.length; i++) {
				System.out.println("남은 동전 " + coin[i] + "원:" + cnt[i] + "개");
			}
			
		} else {
			System.out.println("동전이 부족합니다.");
		}
		
		sc.close();
	}
}
