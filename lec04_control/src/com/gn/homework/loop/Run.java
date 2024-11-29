package com.gn.homework.loop;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("2. 구구단 무한반복");
		System.out.println("3. 탈출합시다.");
		System.out.println("6. 트리 만들기");
		System.out.println("7. 박수박수박");
		System.out.print("선택 : ");
		int num = sc.nextInt();
		
		Practice02 b = new Practice02();
		Practice03 c = new Practice03();
		Practice06 f = new Practice06();
		Practice07 g = new Practice07();
		
		switch(num) {
		case 2: b.ptc02(); break;
		case 3: c.ptc03(); break;
		case 6: f.ptc06(); break;
		case 7: g.ptc07(); break;
		
		}
		sc.close();
		
		

	}

}
