package com.gn.practice04.controller;

import com.gn.practice04.model.vo.Car;

public class Run {
	public static void main(String[] args) {
		Car myCar = new Car();
		
//		1. 시동걸기 -> 출력
		myCar.startEngine();

//		2. 속도 확인하기
		int defaultSpeed = myCar.checkSpeed();
		System.out.println("기본 속도는 " + defaultSpeed + "km/h입니다.");
		
//		3. 속도 설정하기 -> 출력
		myCar.setSpeed(80);
		
//		4. 여행 목적지 설정하기
		String msg = myCar.setDestination("서울");
		System.out.println(msg);
		 
		myCar.onGoing();
	}
}
