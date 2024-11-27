package com.gn.study;
// 1. 외부에서 가져오기
import java.util.Scanner;

public class UserScanner {

	public static void main(String[] args) {
//		2. Scanner 이름짓기
		Scanner sc = new Scanner(System.in);
//		3. 입력받기
		
//		정수 형태 데이터 입력받기
		System.out.print("점수 : ");
		int num = sc.nextInt();
		System.out.println(num);
		
		sc.nextLine(); // 이거 없으면 다음 nextLine이 작동을 안함.
		
		System.out.print("이름 : ");
		String name1 = sc.nextLine();
//		String name2 = sc.next();
		System.out.println(name1);
		
		sc.close();

	}

}
