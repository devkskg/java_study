package com.gn.practice03.controller;

import com.gn.practice03.model.vo.Bicycle02;
import com.gn.practice03.model.vo.Car02;
import com.gn.practice03.model.vo.Vehicle02;

public class Run02 {
	public static void main(String[] args) {
		
		Vehicle02 v1 = new Bicycle02();
		Vehicle02 v2 = new Car02();
		Vehicle02 v0 = new Vehicle02();
		
		Vehicle02[] vArr = new Vehicle02[2];
		vArr[0] = v1;
		vArr[1] = v2;
//		vArr[2] = v0;
		
		
//		이 형태는 Bicycle과 Car의 다른 메소드를 사용하고 싶을 때!!!!
//		이 형태는 Bicycle과 Car의 다른 메소드를 사용하고 싶을 때!!!!
		for(Vehicle02 v : vArr) {
			if(v instanceof Bicycle02) {
				((Bicycle02)v).go();
			} else if(v instanceof Car02){
				((Car02)v).go();
			}
			v0.go();
		}
//		이 형태는 Bicycle과 Car의 다른 메소드를 사용하고 싶을 때!!!!
//		이 형태는 Bicycle과 Car의 다른 메소드를 사용하고 싶을 때!!!!

//		이 형태는 일반적으로 쓰는 것
//		이 형태는 일반적으로 쓰는 것
		for(Vehicle02 v : vArr) {
			v.go();
			v0.go();
		}
//		이 형태는 일반적으로 쓰는 것
//		이 형태는 일반적으로 쓰는 것
		
		
		
		
		
	}
}
