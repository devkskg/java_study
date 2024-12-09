package com.gn.practice03.controller;

import com.gn.practice03.model.vo.Bicycle;
import com.gn.practice03.model.vo.Car;
import com.gn.practice03.model.vo.Vehicle;

public class Run {
	public static void main(String[] args) {
		
		Vehicle v = new Vehicle();
		Vehicle b = new Bicycle();
		Vehicle c = new Car();
		
		Vehicle[] arr = new Vehicle[2];
		arr[0] = c;
		arr[1] = b;
		
//		******************************************************
//		오버라이딩 외의 다른 메소드 쓰고 싶을 때 쓰는 것 /// 이거 중요해중요해
//		for(Vehicle a : arr) {
//			if(a instanceof Bicycle) {
////				((Bicycle)a).go(); 이거는 오버라이딩 외의 다른 메소드 쓰고 싶을 때 쓰는 것
//				a.go();
//			} else if(a instanceof Car) {
////				((Car)a).go();
//				a.go();
//			}
//			v.go();
//		}
//		오버라이딩 외의 다른 메소드 쓰고 싶을 때 쓰는 것 /// 이거 중요해중요해
//		******************************************************
		
		for(Vehicle a : arr) {
			a.go();
			v.go();
		}
//		b.gogogo();
		((Bicycle)b).gogogo();
		
		
		
	}
}
