package com.gn.elice.elice01.run;

import com.gn.elice.elice01.model.vo.Actionable;
import com.gn.elice.elice01.model.vo.DanceRobot;
import com.gn.elice.elice01.model.vo.DrawRobot;
import com.gn.elice.elice01.model.vo.SingRobot;

public class Run {
	public static void main(String[] args) {
		Actionable[] robot = new Actionable[3];
		robot[0] = new DanceRobot();
		robot[1] = new SingRobot();
		robot[2] = new DrawRobot();
		for (Actionable r : robot) {
			r.action();
		}

	}
}
