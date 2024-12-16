package com.gn.homework01;

public class Run {
	public static void main(String[] args) {
		String str = "김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
		String[] arr = str.split("\n");

		String[] arr1 = arr[0].split(",");
		String[] arr2 = arr[1].split(",");
		String[] arr3 = arr[2].split(",");

		int i1 = Integer.parseInt(arr1[1]);
		char c1 = arr1[3].charAt(0);
		Person p1 = new Person(arr1[0], i1, arr1[2], c1);
		System.out.println(p1);

		int i2 = Integer.parseInt(arr2[1]);
		char c2 = arr2[3].charAt(0);
		Person p2 = new Person(arr2[0], i2, arr2[2], c2);
		System.out.println(p2);

		int i3 = Integer.parseInt(arr3[1]);
		char c3 = arr3[3].charAt(0);
		Person p3 = new Person(arr3[0], i3, arr3[2], c3);
		System.out.println(p3);

	}
}
