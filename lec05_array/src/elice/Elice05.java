package elice;

import java.util.Scanner;

public class Elice05 {

	public static void main(String[] args) {
		int[] coin = { 500, 100, 50, 10, 5, 1 };
	    int[] cnt = { 5, 5, 5, 5, 5, 5 };
	    Scanner sc = new Scanner(System.in);
	    int money = sc.nextInt();
	    int[] coinMoney = new int[coin.length];
	    int allCoinMoney = 0;
	    int remainFHCoin = cnt[0];
	    int remainOHCoin = cnt[1];
	    int remainFTCoin = cnt[2];
	    int remainTCoin = cnt[3];
	    int remainFCoin = cnt[4];
	    int remainOCoin = cnt[5];
	    
	    
	    for(int i = 0; i < coin.length; i++) {
	    	coinMoney[i] += coin[i] * cnt[i];
	    	allCoinMoney += coinMoney[i];
	    }
	    
	    if(allCoinMoney - money < 0) {
	    	System.out.println("동전이 부족합니다.");
	    } else {
	    	for(int i = 1; i <= remainFHCoin; i++) {
	    		if(money <= 0) {
//	    			cnt[0]++;
	    			break;
	    		}
	    		money -= coin[0];
	    		cnt[0]--;
	    	}
	    	for(int i = 1; i <= remainOHCoin; i++) {
	    		if(money <= 0) {
//	    			cnt[1]++;
	    			break;
	    		}
	    		money -= coin[1];
	    		cnt[1]--;
	    	}
	    	for(int i = 1; i <= remainFTCoin; i++) {
	    		if(money <= 0) {
//	    			cnt[2]++;
	    			break;
	    		}
	    		money -= coin[2];
	    		cnt[2]--;
	    	}
	    	for(int i = 1; i <= remainTCoin; i++) {
	    		if(money <= 0) {
//	    			cnt[3]++;
	    			break;
	    		}
	    		money -= coin[3];
	    		cnt[3]--;
	    	}
	    	for(int i = 1; i <= remainFCoin; i++) {
	    		if(money <= 0) {
//	    			cnt[4]++;
	    			break;
	    		}
	    		money -= coin[4];
	    		cnt[4]--;
	    	}
	    	for(int i = 1; i <= remainOCoin; i++) {
	    		if(money <= 0) {
//	    			cnt[5]++;
	    			break;
	    		}
	    		money -= coin[5];
	    		cnt[5]--;
	    	}
	    }
	    
	    for(int i = 0; i < coin.length; i++) {
	    	System.out.println("남은 동전 " + coin[i] + "원:" + cnt[i] + "개");
	    }
	    
	    
	    
	    System.out.println(allCoinMoney);
	    for(int cn : cnt) {
	    	System.out.println(cn);
	    }
	    System.out.println("money" + money);
//	    if(money > )
//	    for(int i = 0; i < coin.length; i++) {
//	    	money  coin[i] * 
//	    }
	    
	}

}
