package com.gn.practice07.controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.gn.practice07.model.vo.Equipment01;

public class Run01 {
	public static void main(String[] args) {
		Set<Equipment01> storage1 = new HashSet<Equipment01>();
		Equipment01 s1e1 = new Equipment01("라켓", 15000);
		Equipment01 s1e2 = new Equipment01("배트", 6000);
		Equipment01 s1e3 = new Equipment01("축구공", 3000);
		storage1.add(s1e1);
		storage1.add(s1e2);
		storage1.add(s1e3);
		
		Set<Equipment01> storage2 = new HashSet<Equipment01>();
		Equipment01 s2e1 = new Equipment01("배트", 6000);
		Equipment01 s2e2 = new Equipment01("야구공", 5000);
		Equipment01 s2e3 = new Equipment01("글로브", 9000);
		storage2.add(s2e1);
		storage2.add(s2e2);
		storage2.add(s2e3);
		
		Set<Equipment01> unionSt = new HashSet<Equipment01>(storage1);
		unionSt.addAll(storage2);
		Iterator<Equipment01> i = unionSt.iterator();
		System.out.println("=== 합집합 ===");
		while(i.hasNext()) {
			Equipment01 eq = i.next();
			System.out.println(eq);
		}
		
		Set<Equipment01> retainSt = new HashSet<Equipment01>(storage1);
		retainSt.retainAll(storage2);
		i = retainSt.iterator();
		System.out.println("=== 교집합 ===");
		while(i.hasNext()) {
			Equipment01 eq = i.next();
			System.out.println(eq);
		}
		
		Set<Equipment01> removeSt = new HashSet<Equipment01>(storage1);
		removeSt.removeAll(storage2);
		i = removeSt.iterator();
		System.out.println("=== 차집합 ===");
		while(i.hasNext()) {
			Equipment01 eq = i.next();
			System.out.println(eq);
		}
		
	}
}
