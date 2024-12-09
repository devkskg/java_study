package com.gn.study.model.vo;

public interface Alarm {
//	상수 필드 -> public static final 생략 가능.
//	상수 -> 변수명 대문자, 스네이크 케이스
	public static final int MAX_VOLUME = 10;
//	int MAX_VOLUME = 10; // 인터페이스에서는 항상 상수를 쓰기 때문에 인터페이스 클래스에서는 public static final 생략 가능.
	
	
//	추상 메소드 -> public abstract 생략 가능.
	public abstract void soundAlarm();
//	void soundAlarm(); // 상수 필드, 추상 메소드 둘 다 같은 이유로 앞에 생략 가능.
	
	
	
	
	
	
	
	
	
	
	
	
}
