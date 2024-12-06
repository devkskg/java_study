package com.gn.homework01.run;

import java.util.Scanner;

import com.gn.homework01.model.vo.Employee;
import com.gn.homework01.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] sArr = new Student[3];
		sArr[0] = new Student("김철수", 20, 178.2, 70.0, 1, "정보시스템공학과");
		sArr[1] = new Student("이영희", 23, 167.0, 54.0, 4, "물리학과");
		sArr[2] = new Student("홍길동", 21, 197.6, 86.0, 2, "경영학과");
		for(Student sa : sArr) {
//			sa = new Student();
			System.out.println(sa.toString());;
		}
		
		
		
		System.out.println("=== 사원 입력받기 ===");
		int z = 0;
		Employee[] eArr = new Employee[1];
		while(true) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("키 : ");
			double height = sc.nextDouble();
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			System.out.print("부서 : ");
			String dept = sc.next();
			
//			if(z <= eArr.length) {
//				Employee[] zArr = new Employee[eArr.length+1];
//				for(int i = 0; i < eArr.length; i++) {
//					zArr[i] = eArr[i];
//				}
//				eArr = zArr;
//			}
			
			eArr[z] = new Employee(name, age, height, weight, salary, dept);
			z++;
			
			String yn = "";
			while(true) {
				System.out.print("계속 추가하시겠습니까?(y/n)");
				yn = sc.next();
				if(yn.equals("y") || yn.equals("Y")) {
					break;
				} else if(yn.equals("n") || yn.equals("N")) {
					break;
				} else {
					System.out.println("잘못 입력하셨습니다.");
				}
			}
			if(yn.equals("n") || yn.equals("N")) {
			}
			
			break;
		}
		for(int i = 0; i < eArr.length; i++) {
			System.out.println(eArr[i].toString());
		}
		sc.close();
	}
}
