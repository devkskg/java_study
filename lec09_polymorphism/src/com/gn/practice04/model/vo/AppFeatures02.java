package com.gn.practice04.model.vo;

public abstract class AppFeatures02 {
	public abstract void display();
	public abstract void input();
	
	public void close() {
		System.out.println("기능을 종료합니다.");
	}
}
