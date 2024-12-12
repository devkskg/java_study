package com.gn.practice08.run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.gn.practice08.model.vo.Person;

public class Run {
	public static void main(String[] args) {
		int count = 1;
		Set<Person> set1 = new HashSet<Person>();
		set1.add(new Person("홍길동", 20));
		set1.add(new Person("이순신", 25));
		set1.add(new Person("유관순", 22));
//		set1 = new TreeSet<Person>();
		Set<Person> set2 = new HashSet<Person>();
		set2.add(new Person("유관순", 22));
		set2.add(new Person("강감찬", 27));
		set2.add(new Person("을지문덕", 30));
//		set2 = new TreeSet<Person>();

		System.out.println("=== 합집합 ===");
		Set<Person> union = new TreeSet<Person>(set1);
		union.addAll(set2);
		Iterator<Person> i = union.iterator();
		while (i.hasNext()) {
			Person p = i.next();
			System.out.println(count + "번" + p);
//			count++;
			if (i.hasNext()) {
				count++;
			} else {
				count = 1;
			}
		}
//		count = 1;

		System.out.println("=== 교집합 ===");
		Set<Person> cross = new TreeSet<Person>(set1);
		cross.retainAll(set2);
		i = cross.iterator();
		while (i.hasNext()) {
			Person p = i.next();
			System.out.println(count + "번" + p);
			count++;
		}
		count = 1;

		System.out.println("=== 차집합 ===");
		Set<Person> remove = new TreeSet<Person>(set1);
		remove.removeAll(set2);
		i = remove.iterator();
		while (i.hasNext()) {
			Person p = i.next();
			System.out.println(count + "번" + p);
			count++;
		}

	}
}
