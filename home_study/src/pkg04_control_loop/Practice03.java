package pkg04_control_loop;

import java.util.Scanner;

public class Practice03 {
	public void ptc03(){
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = sc.nextLine();
		
		for(int i = 1; ; i++) {
			
			if(str.equals("탈출")) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println(str);
				System.out.print("입력 : ");
				str = sc.nextLine();
			}
			
			
		}
		sc.close();
		
	}

}
