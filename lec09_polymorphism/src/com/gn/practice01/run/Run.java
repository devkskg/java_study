package com.gn.practice01.run;

import com.gn.practice01.model.vo.Employee;
import com.gn.practice01.model.vo.Person;
import com.gn.practice01.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		
//		업캐스팅을 통한 배열 만들기
		Person[] arr1 = new Person[3];
		Person p0 = new Person();
		Person p1 = new Student();
		Person p2 = new Employee();
		arr1[0] = p0;
		arr1[1] = p1;
		arr1[2] = p2;
		for(Person p : arr1) {
			p.introduce();
		}
		
		System.out.println("=====");
		
		
//		딱맞는? 배열 만들기
		Person[] arr2 = new Person[2];
		Student s = new Student();
		Employee e = new Employee();
		arr2[0] = s;
		arr2[1] = e;
		
		for(Person p : arr2) {
			p.introduce();
		}
		
		
	}

}
