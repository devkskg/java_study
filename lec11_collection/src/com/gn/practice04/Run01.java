package com.gn.practice04;

import java.util.ArrayList;
import java.util.List;

public class Run01 {
	public static void main(String[] args) {
		List<Product01> list = new ArrayList<Product01>();
		Product01 p1 = new Product01("사과", 1000);
		Product01 p2 = new Product01("바나나", 2000);
		Product01 p3 = new Product01("딸기", 3000);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		for(Product01 l : list) {
			System.out.println(l);
		}
		
		list.remove(1);
		Product01 p4 = new Product01("오렌지", 1500);
		list.set(0, p4);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
	}
}
