package com.gn.practice04;

import java.util.ArrayList;
import java.util.List;

public class Run {
	public static void main(String[] args) {
		List<Product> arr = new ArrayList<Product>();
		arr.add(new Product("사과", 1000));
//		
		System.out.println(arr.add(new Product("사과", 1000)));
		if (arr.add(new Product("사과", 1000))) {
			System.out.println("사과가 잘 저장 되었습니다");
		}
//		
		arr.add(new Product("바나나", 2000));
		arr.add(new Product("딸기", 3000));

		System.out.println("=== for each로 조회 ===");
		for (Product a : arr) {
			System.out.println(a);
		}

		arr.remove(1);
		arr.set(0, new Product("오렌지", 1500));
		System.out.println("=== 기본 for문으로 조회 ===");
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(i + " : " + arr.get(i));
		}
	}
}
