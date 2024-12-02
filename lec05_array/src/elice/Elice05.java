package elice;

import java.util.Scanner;

public class Elice05 {

	public static void main(String[] args) {
		int[] coin = { 500, 100, 50, 10, 5, 1 };
	    int[] cnt = { 5, 5, 5, 5, 5, 5 };
	    Scanner sc = new Scanner(System.in);
	    int money = sc.nextInt();
	    int[] allCoin = new int[coin.length];
	    
	    for(int i = 0; i < coin.length; i++) {
	    	allCoin += coin[i] * cnt[i];
	    }
	    System.out.println(allCoin);
//	    if(money > )
//	    for(int i = 0; i < coin.length; i++) {
//	    	money  coin[i] * 
//	    }
	    
	}

}
