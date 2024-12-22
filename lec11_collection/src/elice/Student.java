package elice;

public class Student implements Comparable<Student>{
	String name;
	int kor, eng, math;
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		return kor + eng + math;
	}
	
	@Override
	public String toString() {
		return String.format("%s:국어(%d),영어(%d),수학(%d),총점(%d),평균(%.2f)", name, kor, eng, math, getTotal(), getTotal()/3.0);
//		return name + ":" + "국어(" + kor + "),영어(" + eng + "),수학(" + math + "),총점(" + getTotal() + "),평균(" + getTotal()/3.00 + ")";
	}
	
	
	@Override
	public int compareTo(Student other) {
		return this.name.compareTo(other.name);
	}
}
