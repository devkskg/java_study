package com.gn.study.method.controller;

import com.gn.study.method.model.vo.Hospital;
import com.gn.study.method.model.vo.Library;
import com.gn.study.method.model.vo.Smartphone;

public class Run {
	public static void main(String[] args) {
//		객체 생성(=인스턴스화) // myPhone=참조변수명
		Smartphone myPhone = new Smartphone();
		
		System.out.println("===");
		myPhone.checkWork();
		System.out.println("===");
		
//		1. 반환형x, 매개변수x
		myPhone.openApp();
		
//		2. 반환형o, 매개변수x
		int battery = myPhone.checkBattery();
		System.out.println("배터리 잔량 : " + battery);
		
//		3. 반환형x, 매개변수o
		myPhone.setVolume(15);
		
//		4. 반환형o, 매개변수o
		String str = myPhone.sendMsg("방가방가");
		System.out.println(str);
		
//		객체화
		Library library = new Library();
		
		library.borrowBooks("해리포터", "반지의 제왕", "채식주의자");
		
		library.returnBooks(15000, "1984", "파친코", "운수 좋은 날", "국화꽃 한 송이");
		
//		객체화
		Hospital hospital = new Hospital();
		hospital.emergencyCall(); // public 전체
//		hospital.doctorCall(); // protected 후손 클래스
//		hospital.staffAnnouncement(); // default 같은 패키지 내
//		hospital.personalRecord(); // private 같은 클래스 내
		
//		인스턴스를 생성하지 않고 메소드 호출 가능
//		static 처리한 메소드기 때문에 클래스명으로 바로 메소드 부르기 가능.
//		static한 것들은 글자가 눕네!
		Hospital.hospitalInfo();
//		hospital.hospitalInfo();
		
	}
}
