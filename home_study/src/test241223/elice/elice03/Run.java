package test241223.elice.elice03;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if(year % 400 == 0) {
			System.out.println("윤년");
		} else if(year % 100 == 0) {
			System.out.println("평년");
		} else if(year % 4 == 0) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		}
		
		sc.close();
	}

}
