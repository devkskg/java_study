package com.gn.practice01;

public class Run {
	public static void main(String[] args) {
		long before = System.currentTimeMillis();

		int[] arr1 = new int[1000000];

//		for (int a1 : arr1) {
//			int rd = (int) (Math.random() * 100) + 1;
//			a1 = rd;
//		}

		for (int i = 0; i < arr1.length; i++) {
			int rd = (int) (Math.random() * 100) + 1;
			arr1[i] = rd;
		}

		int[] arr2 = new int[arr1.length / 2];
		System.arraycopy(arr1, 0, arr2, 0, arr2.length);

		for (int i = 0; i < arr2.length; i++) {
			if (i % 10 == 9) {
				System.out.println(arr2[i]);
			} else {
				System.out.print(arr2[i] + ", ");
			}
		}

		long after = System.currentTimeMillis();
		System.out.println("복사 작업 소요 시간 : " + (after - before) + "ms");
	}
}
