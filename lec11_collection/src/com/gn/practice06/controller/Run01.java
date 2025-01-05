package com.gn.practice06.controller;

import java.util.HashSet;
import java.util.Set;

import com.gn.practice06.model.vo.Food01;

public class Run01 {
	public static void main(String[] args) {
		Set<Food01> set = new HashSet<Food01>();
		set.add(new Food01("샐러드", 14000));
		set.add(new Food01("치킨", 23000));
		set.add(new Food01("치킨", 50000));
		
		for(Food01 s : set) {
			System.out.println(s);
		}
		
		set.remove(new Food01("치킨", 50000));
		System.out.println("5만원 치킨 취소 : " + set);
		
		
		set.removeAll(set);
		System.out.println("전체 주문 취소 : " + set);
	}
}
