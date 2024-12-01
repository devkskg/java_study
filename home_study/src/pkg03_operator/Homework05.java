package pkg03_operator;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호(-) : ");
		char ch = sc.next().charAt(7);
		
		String str = (ch == '1' || ch == '3') ? "입력하신 주민번호는 남성입니다." : ((ch == '2' || ch == '4') ? "입력하신 주민번호는 여성입니다." : "입력하신 주민번호는 잘못된 값입니다.");
		
		System.out.println(str);
		
		sc.close();
		
	}

}
