package com.gn.homework03.brain;

public class Brain {
	String str1;
	String str2;
	String totalStr;
	int num1;
	int num2;
	int totalInt;
	
	public Brain() {}
	
	public Brain(String str1, String str2) {
		this.str1 = str1;
		this.str2 = str2;
	}
	
	public Brain(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	
	
	public String method1() {
		totalStr = "";
		totalStr = str1 + str2;
		return totalStr;
	}
	
	public int method2() {
			totalInt = num1 * num2;
			return totalInt;
	}
	
	public String method3() {
		if(str1.equals(str2)) {
			return "true";
		} else {
			return "false";
		}
	}
	
}
