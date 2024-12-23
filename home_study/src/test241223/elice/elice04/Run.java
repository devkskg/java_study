package test241223.elice.elice04;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		if(num % 2 == 0) {
			for(int i = 0; i <= num; i = i+2) {
				sum += i;
			}
		} else {
			for(int i = 1; i <= num; i = i+2) {
				sum += i;
			}
		}
		System.out.println(sum);
		sc.close();
	}

}
