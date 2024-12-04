package com.gn.study.method.controller;

import com.gn.study.method.model.vo.Smartphone;

public class Run {
	public static void main(String[] args) {
//		객체 생성(=인스턴스화) // myPhone=참조변수명
		Smartphone myPhone = new Smartphone();
		
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
		
	}
}
