package com.gn.study.model.vo;

public class Flower {
	private String name;
	private String color;
	
	public Flower() {}
	public Flower(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		Flower f = (Flower)obj; // 강제형변환. 객체지향언어 특징 - 다형성
//		if(this.color.equals(f.color) && this.name.equals(f.name)) {
//			return true;
//		} else {
//			return false;
//		}
//	}
	@Override
	public boolean equals(Object obj) {
//		if(obj instanceof Flower) {
			Flower other = (Flower) obj;
			if(other.color.equals(this.color) && other.name.equals(this.name)) {
				return true;
			} else {
				return false;
			}
//		}
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + "\n색상 : " + color;
		
	}
	
	
	
	
	
	
	
	
	
	
}
