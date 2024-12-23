package test241223.elice.elice06;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int animal = sc.nextInt();
		int legs = sc.nextInt();
		
		
		int x = (legs - 2 * animal) / 2;
		int y = animal - x;
		
		for(int i = 1; i < animal; i++) {
			if(i == ((legs - 2 * animal) / 2)) {
				x = i;
				break;
			}
		}
		
		if(x >= 0 && y >= 0) {
			System.out.println(x + " " + y);
		} else {
			System.out.println("계산불가");
		}
		
		
		sc.close();
		
		
		
		
	}
}
