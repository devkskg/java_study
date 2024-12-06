package com.gn.homework02.model.vo;

public class Chocolate extends Cake {
	private int cherry;
	private int chip;
	
	public Chocolate() {}
	public Chocolate(double flour, double cream, int cherry, int chip) {
		super(flour, cream);
		this.cherry = cherry;
		this.chip = chip;
	}
	
	@Override
	public String toString() {
		return "";
	}

}
