package test241223.elice.elice10;

public class Main {
	public static void main(String[] args) {

		Student s1 = new Student(100, "홍길동", "경영");
		Student s2 = new Student(100, "홍길동", "컴공");
		if (s1.equals(s2)) {
			System.out.println(s1 + "과 " + s2 + "학생은 같은 학생입니다.");
		} else {
			System.out.println(s1 + "과 " + s2 + "학생은 다른 학생입니다.");
		}

	}
}
