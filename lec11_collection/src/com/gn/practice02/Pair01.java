package com.gn.practice02;

public class Pair01<T, U> {
	private T first;
	private U second;
	
	public Pair01() {}
	public Pair01(T first, U second) {
		this.first = first;
		this.second = second;
	}
	
	public T getFirst() {
		return first;
	}
	
	public U getSecond() {
		return second;
	}
}
