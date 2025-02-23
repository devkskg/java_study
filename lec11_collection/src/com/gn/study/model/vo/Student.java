package com.gn.study.model.vo;

import java.util.Objects;

//	1. Comparable 인터페이스를 구현한다.
public class Student implements Comparable<Student> {
	public String name;
	public int age;

	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[이름 : " + name + ",나이 : " + age + "]";
	}

//	해시코드!!!!!!!!!!!!!!!!!!
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
//	해시코드!!!!!!!!!!!!!!!!!!

	@Override
	public boolean equals(Object obj) { // 이 부분 완전 중요!!!!
		boolean result = false;
		if (obj instanceof Student) {
			Student s = (Student) obj;
			if (s.name.equals(name) && s.age == age) {
				result = true;
			}
		}
		return result;
	}

//	2. compareTo 메소드를 재정의한다.
	@Override
	public int compareTo(Student other) {
//		문자열 순
		return this.name.compareTo(other.name);

//		아래는 나이순.
//		return이 양수면 앞뒤 바꾼다.
//		return이 음수면 앞뒤 바꾸지 않는다.
//		return이 0이면 두 값이 같다.
//		if (this.age > other.age) {
//			return 1;
//		} else if (this.age < other.age) {
//			return -1;
//		} else {
//			return 0;
//		}

	}
}
