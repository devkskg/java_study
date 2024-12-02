package com.gn.homework.loop;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 1~50까지 짝수 합하기");
		System.out.println("2. 구구단 무한반복");
		System.out.println("3. 탈출합시다.");
		System.out.println("4. 게임 재시작");
		System.out.println("5. 양수만 더하기");
		System.out.println("6. 트리 만들기");
		System.out.println("7. 박수박수박");
		System.out.println("8. 문자열의 개수");
		System.out.print("선택 : ");
		int num = sc.nextInt();
		
		Practice01 a = new Practice01();
		Practice02 b = new Practice02();
		Practice03 c = new Practice03();
		Practice04 d = new Practice04();
		Practice05 e = new Practice05();
		Practice06 f = new Practice06();
		Practice07 g = new Practice07();
		Practice08 h = new Practice08();
		
		switch(num) {
		case 1: a.ptc01(); break;
		case 2: b.ptc02(); break;
		case 3: c.ptc03(); break;
		case 4: d.ptc04(); break;
		case 5: e.ptc05(); break;
		case 6: f.ptc06(); break;
		case 7: g.ptc07(); break;
		case 8: h.ptc08(); break;
		
		}
		sc.close();
		
		

	}

}
