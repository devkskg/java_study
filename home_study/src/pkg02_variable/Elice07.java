package pkg02_variable;

import java.util.Scanner;

public class Elice07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double radius = scan.nextDouble();
		double pi = 3.141592;
		double cirLength = 2 * pi * radius;
		double cirArea = (radius * radius) * pi;
		System.out.println("둘레:" + cirLength);
		System.out.println("넓이:" + cirArea);
		
		scan.close();

	}

}
