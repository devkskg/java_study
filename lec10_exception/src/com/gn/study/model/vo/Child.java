package com.gn.study.model.vo;

public class Child extends Parent {
	@Override
	public void method()
//			throws IllegalArgumentException { // 같은 애라 되네
//	throws Exception{ // 이건 더 예외가 넓어서 안되네
			throws NullPointerException { // 같은 레벨이라 되네
//		부모가 예외가 2개라도 하나만 예외해도 되네!
		System.out.println("Child");
	}
}
