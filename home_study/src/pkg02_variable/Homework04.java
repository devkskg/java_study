package pkg02_variable;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요 : ");
		String ch = sc.next();
		int convCh = (int)ch.charAt(0);
		
		System.out.println("A의 유니코드 : " + convCh);
		
		sc.close();

	}

}
