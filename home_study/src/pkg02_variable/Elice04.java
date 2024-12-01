package pkg02_variable;

import java.util.Scanner;

public class Elice04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		int fiveHundCoin = money / 500;
		int oneHundCoin = (money % 500) / 100;
		int fiftyCoin = (money % 100) / 50;
		int tenCoin = (money % 50) / 10;
		int oneCoin = (money % 10) / 1;
		System.out.println("500원:" + fiveHundCoin + "개");
		System.out.println("100원:" + oneHundCoin + "개");
		System.out.println("50원:" + fiftyCoin + "개");
		System.out.println("10원:" + tenCoin + "개");
		System.out.println("1원:" + oneCoin + "개");
		
		scan.close();

	}

}
