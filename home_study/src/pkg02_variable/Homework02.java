package pkg02_variable;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		System.out.print("세로 : ");
		double height = sc.nextDouble();
		
		double area = width * height;
		double length = (width + height) * 2;
		
		System.out.println("면적 : " + area);
		System.out.println("둘레 : " + length);
		
		sc.close();

	}

}
