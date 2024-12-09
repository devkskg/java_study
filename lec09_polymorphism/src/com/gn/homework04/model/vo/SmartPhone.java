package com.gn.homework04.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay {
//	이 클래스의 존재의미가 좀 없는듯한 느낌?
//	-> 여러 인터페이스를 implements를 받아도 일반적인 상속과 다르게 괜찮다는 걸 보여주려고..?
	public SmartPhone() {}
	
	public void printMaker() {
		
	}
	
	
	
	@Override
	public void makeCall() {
		
	}

	@Override
	public void takeCall() {
		
	}

	@Override
	public void picture() {
		
	}

	@Override
	public void charge() {
		
	}

	@Override
	public void touch() {
		
	}

}
