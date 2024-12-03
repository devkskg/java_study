package com.gn.homework.dimensional;

public class Practice07 {
	public void ptc07() {
		String[] report = {"Introduction", "Research", "Conclusion"};
		String[] report2 = new String[report.length];
		
		for(int i = 0; i < report.length; i++) {
			report2[i] = report[i];
		}
		report2[0] = "Team Feedback";
		
		System.out.print("원본 보고서 : ");
		for(int i = 0; i < report.length; i++) {
			if(i == report.length - 1) {
				System.out.print(report[i]);
			} else {
				System.out.print(report[i] + ", ");
			}
		}
		System.out.println();
		
		System.out.print("복사된 보고서 : ");
		for(int i = 0; i < report2.length; i++) {
			if(i == report2.length - 1) {
				System.out.print(report2[i]);
			} else {
				System.out.print(report2[i] + ", ");
			}
		}
		
	}
}
