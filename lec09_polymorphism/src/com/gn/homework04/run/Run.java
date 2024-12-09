package com.gn.homework04.run;

import com.gn.homework04.model.vo.GalaxyS24;
import com.gn.homework04.model.vo.Iphone15;
import com.gn.homework04.model.vo.SmartPhone;

public class Run {
	public static void main(String[] args) {
		SmartPhone[] arr = new SmartPhone[2];
		SmartPhone g = new GalaxyS24();
		SmartPhone i = new Iphone15();
		arr[0] = g;
		arr[1] = i;
		
		for(SmartPhone a : arr) {
			if(a instanceof GalaxyS24) {
				System.out.println(((GalaxyS24)a).name() + "는 삼성에서 만들어 졌다.");
				a.makeCall();
				a.takeCall();
				a.touch();
				a.charge();
				a.picture();
				System.out.println();
			} else {
				System.out.println(((Iphone15)a).name() + "는 애플에서 만들어 졌다.");
				a.makeCall();
				a.takeCall();
				a.touch();
				a.charge();
				a.picture();
			}
		}
		
		
		
		
		
		
		
	}
}
