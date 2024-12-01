package pkg04_control_loop;

import java.util.Scanner;

public class Elice06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		
		for(int i = 1; i <= num; i++) {
			
			if(i % 2 == 0) {
                sum1 += i; // 2의 배수
            }
            if(i % 3 == 0) {
                sum2 += i; // 3의 배수
            }
            if(i % 6 == 0) {
                sum3 += i; // 중복된 6의 배수
            }
		}
		System.out.println(sum1 + sum2 - sum3);
		sc.close();
	}

}
