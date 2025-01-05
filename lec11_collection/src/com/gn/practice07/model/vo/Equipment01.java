package com.gn.practice07.model.vo;

import java.util.Objects;

public class Equipment01 {
	public String name;
	public int price;
	public Equipment01() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Equipment01(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return " - " + name + " : " + price + "원";
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
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipment01 other = (Equipment01) obj;
		return Objects.equals(name, other.name) && price == other.price;
	}
	
	
}
