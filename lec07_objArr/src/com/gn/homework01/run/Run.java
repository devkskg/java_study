package com.gn.homework01.run;

import java.util.Scanner;

import com.gn.homework01.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		
		Student[] arr = new Student[10];
		
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
//		String yn = "y";
//		
//		arr[0].setGrade(1);
//		System.out.println(arr[0].getGrade());
//		
//		while(yn.equals("y")||yn.equals("Y")) {
//			arr[count].setGrade(sc.nextInt());
//			
//			yn = sc.next();
//			count++;
//		}
		
		
//		for(int i = 0; i < arr.length; i++) {
//			count++;
//			System.out.print("학년 : ");
//			arr[i].setGrade(sc.nextInt());
//		}
		
		for(Student ar : arr) {
			count++;
			ar = new Student(); // 이거 안들어가면 오류나는데??
			System.out.print("학년 : ");
			int grade = sc.nextInt();
			ar.setGrade(grade);
			System.out.print("반 : ");
			ar.setClassroom(sc.nextInt());
			System.out.print("이름 : ");
			ar.setName(sc.next());
			System.out.print("국어점수 : ");
			ar.setKor(sc.nextInt());
			System.out.print("영어점수 : ");
			ar.setEng(sc.nextInt());
			System.out.print("수학점수 : ");
			ar.setMath(sc.nextInt());
			System.out.print("계속 추가하시겠습니까? ");
			String yn = sc.next();
			if(yn.equals("y") || yn.equals("Y")) {
				continue;
			} else if(yn.equals("n") || yn.equals("N")) {
				break;
			} else {
				System.out.println("잘못 입력 하셨습니다.");
			}
		}
		
		for(Student a : arr) {
			a.information();
		}
		
		
	}

}
