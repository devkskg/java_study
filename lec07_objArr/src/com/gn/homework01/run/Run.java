package com.gn.homework01.run;

import java.util.Scanner;

import com.gn.homework01.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		
		Student[] arr = new Student[10];
		int count = 1;
		Scanner sc = new Scanner(System.in);
		String yn = "y";
		
		for(int i = 0; i < count; i++) {
			arr[i] = new Student(); // 이거 안들어가면 오류나는데??
//			처음에 배울때 인덱스로 선언하면서 자연스레 new 클래스명(매개변수);를 사용해서
//			그때는 자연스레 넘어갔던 것 같아.
//			노션에 맨 마지막 줄에 설명 있음!
			System.out.print("학년 : ");
			int grade = sc.nextInt();
			arr[i].setGrade(grade);
			System.out.print("반 : ");
			arr[i].setClassroom(sc.nextInt());
			System.out.print("이름 : ");
			arr[i].setName(sc.next());
			System.out.print("국어점수 : ");
			arr[i].setKor(sc.nextInt());
			System.out.print("영어점수 : ");
			arr[i].setEng(sc.nextInt());
			System.out.print("수학점수 : ");
			arr[i].setMath(sc.nextInt());
			
			while(true) {
				System.out.print("계속 추가하시겠습니까? ");
				yn = sc.next();
				if(yn.equals("y") || yn.equals("Y")) {
					count++;
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
		}
		for(int i = 0; i < count; i++) {
//			arr[i] = new Student(); 위에서 arr[i] = new Student 참조 했으니 이번엔 안해도 된다.
			System.out.println(arr[i].information());
		}
	sc.close();	
	}
	
}
