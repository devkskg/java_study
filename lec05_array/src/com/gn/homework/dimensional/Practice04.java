package com.gn.homework.dimensional;

public class Practice04 {
	public void ptc04() {
//		int rd = (int)(Math.random()*45)+1;
//		System.out.println(rd);
		int[] arr = new int[6];
		int k = 0;
		
		while(true) {
			for(int i = 0; i < arr.length; i++) {
				arr[i] = (int)(Math.random()*45)+1;
			}
			
			for(int i = 0; i < arr.length - 1; i++) {
				for(int j = i + 1; j < arr.length; j++) {
					if(arr[i] > arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			
			for(int i = 0; i < arr.length - 1; i++) {
				for(int j = i+ 1; j < arr.length; j++ ) {
					if(arr[i] == arr[j]) {
						k++;
						break;
					}
				}
			}
			
			if(k == 1) {
				continue;
			} else if(k != 1) {
				break;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
//			for(int a : arr) {
//				System.out.println(a);
//			}
		
	}
	
}
