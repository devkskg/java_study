package com.gn.practice02;

public class Run01 {
	public static void main(String[] args) {
		Pair01<String, Integer> p1 = new Pair01<String, Integer>("Apple", 10);
		String f = p1.getFirst();
		int s = p1.getSecond();
		System.out.println("First : " + f);
		System.out.println("Second : " + s);
	}
}
