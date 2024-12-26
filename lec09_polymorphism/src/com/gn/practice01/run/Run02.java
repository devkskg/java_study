package com.gn.practice01.run;

import com.gn.practice01.model.vo.Employee02;
import com.gn.practice01.model.vo.Person02;
import com.gn.practice01.model.vo.Student02;

public class Run02 {
	public static void main(String[] args) {
		Person02 p1 = new Student02();
		Person02 p2 = new Employee02();
		Person02[] arr = new Person02[2];
		arr[0] = p1;
		arr[1] = p2;
		
		
		for(Person02 p : arr) {
			p.introduce();
		}
		
		
		Person02[] arr2 = new Person02[2];
		Student02 s = new Student02();
		Employee02 e = new Employee02();
		arr2[0] = s;
		arr2[1] = e;
		for(Person02 ar : arr2) {
			ar.introduce();
		}
	}
}
