package elice.elice01;

import java.util.Scanner;

public class Main {
//	필드, 메소드 실습
//	구동 클래스(Main)는 화면에서 직사각형의 가로와 세로를 입력받아 직사각형의 넓이와 둘레를 계산하는 프로그램을 했습니다. 구동클래스에 맞도록 Rectangle 클래스를 구현하여 결과가 나오도록 프로그램을 구현하시오
//	Rectangle 클래스의 멤버는 다음과 같습니다.
//	멤버변수: 가로(width),세로(height)
//	멤버메서드:
//	area() : 직사각형의 넓이를 출력
//	length() : 직사각형의 둘레를 출력
//	[입력]
//	10 5
//	[출력]
//	면적:50
//	둘레:30
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		  Rectangle r1 = new Rectangle();
		  r1.width=sc.nextInt();
		  r1.height=sc.nextInt();
		  r1.area();
		  r1.length();
		  
		  sc.close();
	}

}
