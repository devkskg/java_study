package elice;

import java.util.Scanner;

public class Elice05_1 {

	public static void main(String[] args) {
//		더 개선 가능할 거 같다. 반복 되는 문장이 많음.
		
		int[] coin = { 500, 100, 50, 10, 5, 1 };
		int[] cnt = { 5, 5, 5, 5, 5, 5 };
		int[] cnt2 = { 5, 5, 5, 5, 5, 5 };
	    Scanner sc = new Scanner(System.in);
	    int money = sc.nextInt();
	    int totalMoney = money;
	    int[] coinMoney = new int[coin.length];
	    int allCoinMoney = 0;
	    
	    for(int i = 0; i < coin.length; i++) {
	    	coinMoney[i] += coin[i] * cnt[i];
	    	allCoinMoney += coinMoney[i];
	    }
	    
	    if(allCoinMoney - money < 0) {
	    	System.out.println("동전이 부족합니다.");
	    } else {
	    
	    for(int i = 1; i <= (totalMoney / coin[0]); i++) {
	    	money -= coin[0];
    		cnt[0]--;
    		if(cnt[0] == 0 || money - coin[0] <0) {
    			totalMoney = money;
    			break;
    		}
	    }
	    for(int i = 1; i <= (totalMoney / coin[1]); i++) {
	    	money -= coin[1];
    		cnt[1]--;
    		if(cnt[1] == 0 || money - coin[1] <0) {
    			totalMoney = money;
    			break;
    		}
	    }
	    for(int i = 1; i <= (totalMoney / coin[2]); i++) {
	    	money -= coin[2];
    		cnt[2]--;
    		if(cnt[2] == 0 || money - coin[2] <0) {
    			totalMoney = money;
    			break;
    		}
	    }
	    for(int i = 1; i <= (totalMoney / coin[3]); i++) {
	    	money -= coin[3];
    		cnt[3]--;
    		if(cnt[3] == 0 || money - coin[3] <0) {
    			totalMoney = money;
    			break;
    		}
	    }
	    for(int i = 1; i <= (totalMoney / coin[4]); i++) {
	    	money -= coin[4];
    		cnt[4]--;
    		if(cnt[4] == 0 || money - coin[4] <0) {
    			totalMoney = money;
    			break;
    		}
	    }
	    for(int i = 1; i <= (totalMoney / coin[5]); i++) {
	    	money -= coin[5];
    		cnt[5]--;
    		if(cnt[5] == 0 || money - coin[5] <0) {
    			totalMoney = money;
    			break;
    		}
	    }
	    for(int i = 0; i < coin.length; i++) {
	    	System.out.println(coin[i] + "원:" + (cnt2[i] - cnt[i]));
	    }
	    for(int i = 0; i < coin.length; i++) {
	    	System.out.println("남은 동전 " + coin[i] + "원:" + cnt[i] + "개");
	    }
	    }
	    sc.close();

	}

}
