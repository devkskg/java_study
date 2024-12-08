package com.gn.homework01.run;

import java.util.Scanner;

import com.gn.homework01.model.vo.Employee;

public class Run2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("=== 사원 입력받기 ===");
        Employee[] eArr = new Employee[0]; // 초기 배열 길이 0
        int z = 0; // 현재 사원 수

        while (true) {
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

            // 새로운 Employee 객체를 생성
            Employee newEmployee = new Employee(name, age, height, weight, salary, dept);

            // 배열의 크기를 1 늘리기 위해 새로운 배열을 생성
            Employee[] nArr = new Employee[z + 1];
            // 기존 배열의 내용을 새로운 배열로 복사
            for (int i = 0; i < eArr.length; i++) {
                nArr[i] = eArr[i];
            }
            // 새 Employee 객체를 추가
            nArr[z] = newEmployee;
            eArr = nArr; // eArr를 새로운 배열로 업데이트
            z++; // 사원 수 증가

            String yn;
            while (true) {
                System.out.print("계속 추가하시겠습니까?(y/n): ");
                yn = sc.next();
                if (yn.equalsIgnoreCase("y")) {
                    break;
                } else if (yn.equalsIgnoreCase("n")) {
                    // 입력된 모든 사원 정보를 출력
                    for (Employee employee : eArr) {
                        System.out.println(employee.toString());
                    }
                    sc.close();
                    return; // 프로그램 종료
                } else {
                    System.out.println("잘못 입력하셨습니다.");
                }
            }
        }
	}

}
