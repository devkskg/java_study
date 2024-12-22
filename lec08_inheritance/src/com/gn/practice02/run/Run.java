package com.gn.practice02.run;

import com.gn.practice02.model.vo.Appliance;
import com.gn.practice02.model.vo.Refrigerator;
import com.gn.practice02.model.vo.WashingMachine;

public class Run {
	public static void main(String[] args) {
		
		Appliance ap = new Appliance();
		Appliance wa = new WashingMachine();
		Appliance re = new Refrigerator();
		
		ap.turnOn();
		wa.turnOn();
		re.turnOn();
	}
	
	
	
}
