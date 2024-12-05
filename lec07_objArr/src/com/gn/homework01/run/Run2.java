package com.gn.homework01.run;

import java.util.Scanner;

import com.gn.homework01.model.vo.Student;

public class Run2 {
	public static void main(String[] args) {
		Student[] arr = new Student[10];
		
//		arr[0] = new Student();
		Scanner sc = new Scanner(System.in);
		
//		arr[0] = {new Student(sc.nextInt(), sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt())};
		String yn = "y";
		int count = 1;
		for(int i = 0; i < count; i++) {
//			arr[i] = new Student();
			arr[i] = new Student(sc.nextInt(), sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
			while(true) {
				System.out.print("계속 추가하시겠습니까? ");
				yn = sc.next();
				if(yn.equals("y") || yn.equals("Y")) {
					break;
				} else if(yn.equals("n") || yn.equals("N")) {
					break;
				} else {
					System.out.println("잘못 입력 하셨습니다.");
					
				}
			}
			if(yn.equals("n") || yn.equals("N")) {
				break;
			}
			count++;
		}
		for(int i = 0; i < count; i++) {
			arr[i] = new Student();
			System.out.println(arr[i].information());
		}
		
	}

}
