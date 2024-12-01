package pkg02_variable;

import java.util.Scanner;

public class Elice05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.next().charAt(0);
		int convertNum = (num - 48) * 10;
		System.out.println(convertNum);
		
		scan.close();
		
	}

}
