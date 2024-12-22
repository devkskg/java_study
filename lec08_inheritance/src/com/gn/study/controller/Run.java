package com.gn.study.controller;

import com.gn.study.model.vo.Child;
import com.gn.study.model.vo.Dog;
import com.gn.study.model.vo.Flower;
import com.gn.study.model.vo.Juice;
import com.gn.study.model.vo.Parent;
import com.gn.study.model.vo.Pizza;

public class Run {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
//		Cat c = new Cat();
		
//		Parent p = new Parent();
//		System.out.println(p.getA());
		Child c = new Child();
		System.out.println(c.getA());
		
		Juice j = new Juice("트로피칼", 500, "용과");
//		j.printInfo();
		j.juiceInfo();
		
		Pizza p = new Pizza();
		p.printReaction();
		
		System.out.println("====");
		Flower f1 = new Flower("장미", "빨간색");
		Flower f2 = new Flower("장미", "빨간색");
		
//		Flower에 오버라이드 해서 true 결과 나옴. 
//		Flower 클래스에서 오버라이드 한 부분을 지우면 false 결과 나옴.
		if(f1.equals(f2)) {
			System.out.println("똑같아요!");
		} else {
			System.out.println("X");
		}
		
//		Flower에 오버라이드 해서 이름 : . 색상 : . 결과 나옴.
//		Flower 클래스에서 오버라이드 한 부분을 지우면 주소값 나옴.
		System.out.println(f1);
		
		
		
		
		
		
		
	}
}
