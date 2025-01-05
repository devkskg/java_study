package com.gn.practice06.model.vo;

import java.util.Objects;

public class Food01 {
	private String name;
	private int price;
	public Food01() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Food01(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		if(obj instanceof Food01) {
			Food01 other = (Food01)obj;
			if(other.name.equals(name) && other.price == price) {
				result = true;
			}
		}
		
		return result;
	}
	
	@Override
	public String toString() {
		return  name + ":" + price;
	}
	
}
