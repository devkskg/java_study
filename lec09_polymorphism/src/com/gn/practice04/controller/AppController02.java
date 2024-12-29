package com.gn.practice04.controller;

import com.gn.practice04.model.vo.AppFeatures02;
import com.gn.practice04.model.vo.LoginMenu02;

public class AppController02 {
	public void startMyApp() {
		AppFeatures02 af = new LoginMenu02();
		af.display();
		af.input();
		af.close();
		
	}
}
