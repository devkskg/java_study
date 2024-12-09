package com.gn.study.model.vo;

public class Planet {
	public void description() {
		System.out.println("태양 주위를 공전하는 천체");
	}
//	오버로딩(매개변수의 순서 개수 타입을 다르게 해서 똑같은 이름의 메소드를 여러개 만드는 것)
	public void description(int age) {
		System.out.println(age + "억년");
	}
	
	
	public void material() {
		System.out.println("행성마다 물질이 달라요.");
	}
}
