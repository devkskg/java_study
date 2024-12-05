package com.gn.study.capsule;

import com.gn.study.capsule.closed.Account2;
import com.gn.study.capsule.open.Account1;

public class Run {
	public static void main(String[] args) {
		
		Student s = new Student();
//		System.out.println(s.studentNo);
		
//		setter
		s.setStudentNo(50);
		
//		getter
		int num = s.getStudentNo();
		System.out.println(num);
		
//		캡슐화 x
//		열려있는 계좌 Account1
		Account1 a1 = new Account1("철수", 2000);
		a1.balance -= 5000; // 잔액에 직접 접근
		System.out.println(a1.balance);
		
		
		Account2 a2 = new Account2("철수", 2000);
//		a2.balance -= 5000; // 잔액에 직접 접근
//		System.out.println(a2.balance);
		
		a2.setBalance(a2.getBalance() - 5000);
		System.out.println(a2.getBalance());
		
		
	}

}
