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
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		System.out.println("=== 사원 입력받기 ===");
		
		int z = 0;
		Employee[] eArr = new Employee[0];
		
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
			
			
			
			
//			eArr[z] = new Employee(name, age, height, weight, salary, dept);
			z++;
			
			Employee[] nArr = new Employee[z]; // 늘어날때마다 배열길이 +1
			for(int i = 0; i < eArr.length; i++) {
//				eArr[i] = new Employee();
				nArr[i] = eArr[i];
			}
			nArr[z-1] = new Employee(name, age, height, weight, salary, dept);
			eArr = nArr; // 기존 배열의 주소값을 새로운 배열의 주소값으로 변화
			
			
			String yn = "";
			while(true) {
				System.out.print("계속 추가하시겠습니까?(y/n)");
				yn = sc.next();
				if(yn.equals("y") || yn.equals("Y")) {
//					z++;
					break;
				} else if(yn.equals("n") || yn.equals("N")) {
					for(int i = 0; i < z; i++) {
//						eArr[i] = new Employee();
						System.out.println(eArr[i].toString());
					}
					break;
				} else {
					System.out.println("잘못 입력하셨습니다.");
				}
			}
			
			
			if(yn.equals("n") || yn.equals("N")) {
			break;
			}
		}
		
		sc.close();
	}
}
