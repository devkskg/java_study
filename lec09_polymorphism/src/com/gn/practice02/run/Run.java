package com.gn.practice02.run;

//import com.gn.practice01.model.vo.Person;
import com.gn.practice02.model.vo.SchoolMember;
import com.gn.practice02.model.vo.Staff;
import com.gn.practice02.model.vo.Student;
import com.gn.practice02.model.vo.Teacher;

public class Run {
	public static void main(String[] args) {
		
		SchoolMember[] arr = new SchoolMember[5];
		
		Student st = new Student();
		Teacher tc = new Teacher();
		Staff sf = new Staff();
		SchoolMember sm = new SchoolMember();
		
//		패키지 외부에서 끌어왔음. 상속관계x
//		Person ps = new Person();
		
		arr[0] = st; // = new Student(); 이런 식으로도 바로 가능하다.
		arr[1] = tc; // = new Teacher(); 이런 식으로도 바로 가능하다.
		arr[2] = sf; // = new Staff(); 이런 식으로도 바로 가능하다.
		arr[3] = sm; // = new SchoolMember(); 이런 식으로도 바로 가능하다.
//		상속관계가 아니어서 SchollMember arr에 포함 시킬 수 없다.
//		arr[4] = ps;
		
		for(SchoolMember a : arr) {
			if(a instanceof SchoolMember) {
				a.introduce();
			}
//			잘못된 구성원 없으면 if 없이 바로 공통된 인사 a.introduce(); 쓰면 된다!
			
			if(a instanceof Student) {
//				((Student)a).introduce();
				((Student)a).study();
			} else if(a instanceof Teacher) {
//				((Teacher)a).introduce();
				((Teacher)a).teach();
			} else if(a instanceof Staff) {
//				((Staff)a).introduce();
				((Staff)a).work();
			} else if(a instanceof SchoolMember) {
//				a.introduce();
				((SchoolMember)a).introduce();
			} else {
//				arr의 길이가 하나 남아서 기본값 else에 걸려서 출력된다.
				System.out.println("잘못된 구성원이 있습니다.");
			}
		}
	}
	
	
}
