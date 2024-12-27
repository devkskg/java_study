package com.gn.practice02.run;

import com.gn.practice02.model.vo.SchoolMember02;
import com.gn.practice02.model.vo.Staff02;
import com.gn.practice02.model.vo.Student02;
import com.gn.practice02.model.vo.Teacher02;

public class Run02 {
	public static void main(String[] args) {
		SchoolMember02[] sm = new SchoolMember02[3];
		SchoolMember02 sm1 = new Student02();
		SchoolMember02 sm2 = new Teacher02();
		SchoolMember02 sm3 = new Staff02();
		
		sm[0] = sm1;
		sm[1] = sm2;
		sm[2] = sm3;
		
		for(SchoolMember02 s : sm) {
			s.introduce();
			if(s instanceof Student02) {
				((Student02) s).study();
			} else if(s instanceof Teacher02) {
				((Teacher02) s).teach();
			} else if(s instanceof Staff02) {
				((Staff02) s).work();
			}
		}
	}
}
