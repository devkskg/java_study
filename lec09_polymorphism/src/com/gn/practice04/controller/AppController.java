package com.gn.practice04.controller;

import com.gn.practice04.model.vo.AppFeatures;
import com.gn.practice04.model.vo.LoginMenu;

public class AppController {
//	추상 클래스는 껍데기만 사용 가능
//	고급지게 말하면 -> 추상 클래스는 객체화의 구현체에 사용 못한다.
//	AppFeatures 타입의 LoginMenu 클래스 인스턴스화
//	근데 굳이 AppFeatures 타입으로 인스턴스화 해야함??
	AppFeatures a1 = new LoginMenu();
	
	public void startMyApp() {
		a1.display();
		a1.input();
		a1.close();
	}
	
	
}
