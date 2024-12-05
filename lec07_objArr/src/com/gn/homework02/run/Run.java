package com.gn.homework02.run;

import com.gn.homework02.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		Employee[] emp = new Employee[3];
		emp[0] = new Employee();
		emp[1] = new Employee(1, "이영희", 19, 'M', "01022223333", "가산");
		emp[2] = new Employee(2, "김철수", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "구디");
		
		
		System.out.print("emp[0] : ");
		System.out.println(emp[0].information());
		
		System.out.print("emp[1] : ");
		System.out.println(emp[1].information());
		
		System.out.print("emp[2] : ");
		System.out.println(emp[2].information());
		
		System.out.println("===================");
		
		emp[0].setEmpNo(0);
		emp[0].setEmpName("홍길동");
		emp[0].setDept("영업부");
		emp[0].setJob("팀장");
		emp[0].setAge(30);
		emp[0].setGender('M');
		emp[0].setSalary(3000000);
		emp[0].setBonusPoint(0.2);
		emp[0].setPhone("01055559999");
		emp[0].setAddress("금천구");
		System.out.print("emp[0] : ");
		System.out.println(emp[0].information());
		
		emp[1].setDept("기획부");
		emp[1].setJob("부장");
		emp[1].setSalary(4000000);
		emp[1].setBonusPoint(0.3);
		emp[1].setPhone("01022223333");
		emp[1].setAddress("가산");
		System.out.print("emp[1] : ");
		System.out.println(emp[1].information());
		
		System.out.println("===================");
		
		System.out.println(emp[0].getEmpName() + "의 연봉 : " + emp[0].bonusSalary() + "원");
		System.out.println(emp[1].getEmpName() + "의 연봉 : " + emp[1].bonusSalary() + "원");
		System.out.println(emp[2].getEmpName() + "의 연봉 : " + emp[2].bonusSalary() + "원");
		
		System.out.println("===================");
		
		int sum = 0;
		for(int i = 0; i < emp.length; i++) {
			sum += emp[i].bonusSalary();
		}
		System.out.println("직원들의 평균 연봉 : " + sum / emp.length + "원");
		
	}
}
