package pkg04_control_loop;

import java.util.Scanner;

public class Elice01 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
		sc.close();
	}

}
