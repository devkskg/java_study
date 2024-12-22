package elice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Elice02 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동", 90, 80, 70));
		list.add(new Student("김삿갓", 95, 85, 75));
		list.add(new Student("이몽룡", 80, 95, 95));
		list.add(new Student("임꺽정", 60, 75, 100));
		
		Collections.sort(list);
		
		for(Student l : list) {
			System.out.println(l);
		}
	}
}
