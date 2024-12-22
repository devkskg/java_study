package com.gn.practice01;

public class Run03 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		int[] arr1 = new int[1000000];
		
//		for(int ar1 : arr1) {
//			
//			ar1 = (int)(Math.random() * 100) + 1;
//		}
		
//		(int)(Math.random() * 100) + 1;
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = (int)(Math.random() * 100) + 1;
		}
		
		int[] arr2 = new int[arr1.length / 2];
		System.arraycopy(arr1, 0, arr2, 0, arr2.length);
		
		for(int i = 0; i < arr2.length; i++) {
			if(i % 10 == 9) {
				System.out.println(arr2[i]);
			} else {
				System.out.print(arr2[i] + ", ");
			}
		}
//			if(i != 0 && i % 9 != 0) {
//				System.out.print(arr2[i] + ", ");
//			} else {
//				System.out.println(arr2[i]);
//			}
		
		
		
		
		
		
		long end = System.currentTimeMillis();
		System.out.println("복사 작업 소요 시간 : " + (end - start));
		
	}
}
