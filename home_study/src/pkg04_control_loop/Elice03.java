package pkg04_control_loop;

import java.util.Scanner;

public class Elice03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		int sum = 0;
		
		for(int i = 0; i < num.length(); i++) {
			sum += num.charAt(i) - '0';
		}
		System.out.println(sum);
		sc.close();
	}
}
