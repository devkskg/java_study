package com.gn.study.controller;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.gn.study.model.vo.Product;
import com.gn.study.model.vo.Student;

public class SetRun {
	public static void main(String[] args) {
		Set<Integer> class1 = new HashSet<Integer>();
		class1.add(1);
		class1.add(2);
		class1.add(3);

		Set<Integer> class2 = new HashSet<Integer>();
		class2.add(3);
		class2.add(4);
		class2.add(5);

		System.out.println("=== 1. 합집합 ===");
//		class1.addAll(class2); // class1의 값을 바꿔버린다. 123 -> 12345
		Set<Integer> union = new HashSet<Integer>(class1); // 초기값을 class1로 하겠다!
		union.addAll(class2);
//		System.out.println(class1);
		System.out.println(union);

		System.out.println("=== 2. 교집합 ===");
		Set<Integer> intersection = new HashSet<Integer>(class1);
		intersection.retainAll(class2);
		System.out.println(intersection);

		System.out.println("=== 3. 차집합 ===");
		Set<Integer> difference = new HashSet<Integer>(class1);
		difference.removeAll(class2);
		System.out.println(difference);

		Set<Student> set1 = new HashSet<Student>();
		set1.add(new Student("철수", 20));
		set1.add(new Student("우석", 28));
		set1.add(new Student("은우", 30));

		Set<Student> set2 = new HashSet<Student>();
		set2.add(new Student("철수", 20));
		set2.add(new Student("길동", 25));

//		set1.addAll(set2); // 합집합
//		set1.retainAll(set2); // 교집합
//		set1.removeAll(set2); // 차집합
//		System.out.println(set1);
//		for (Student s : set1) {
//			System.out.println(s);
//		}

		System.out.println("=== Iterator 사용 ===");

		Set<String> fruits = new HashSet<String>();
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("체리");

		Iterator<String> iterator = fruits.iterator();

		while (iterator.hasNext()) { // hasNext는 true||false
			String fruit = iterator.next();
			System.out.print(fruit);
			iterator.remove();
			if (fruits.size() != 0) {
				System.out.print(", ");
			}
		}
		System.out.println();
		System.out.println(fruits);

//		LinkedHashSet
		System.out.println("=== LinkedHashSet ===");
		Set<String> set4 = new LinkedHashSet<String>();
//		set4 = new HashSet<String>();
//		set4 = new LinkedHashSet<String>();
//		TreeSet
//		set4 = new TreeSet<String>();
		set4 = new TreeSet<String>(Collections.reverseOrder());
		set4.add("동");
		set4.add("서");
		set4.add("남");
		set4.add("북");
		System.out.println(set4);
		System.out.println("=== TreeSet ===");

		Set<Product> set = new TreeSet<Product>();
		set.add(new Product("젤리", 2000));
		set.add(new Product("사탕", 500));
		set.add(new Product("홍삼", 8000));
		System.out.println(set);
	}
}
