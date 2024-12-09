package com.gn.homework03.run;

import com.gn.homework03.model.vo.Car;
import com.gn.homework03.model.vo.ElectricEngine;
import com.gn.homework03.model.vo.Engine;
import com.gn.homework03.model.vo.GasolineEngine;

public class Run {
	public static void main(String[] args) {
		Engine gas = new GasolineEngine();
		Engine ect = new ElectricEngine();
		Car c1 = new Car(gas);
		Car c2 = new Car(ect);
//		Car[] arr = new Car[2];
		c1.startEngine();
		c2.startEngine();
		
		
	}
}
