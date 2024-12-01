package pkg02_variable;

import java.util.Scanner;

public class Elice06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double width = scan.nextDouble();
		double height = scan.nextDouble();
		double area = (width * height) / 2;
		System.out.println(area);
		
		scan.close();
		
	}

}
