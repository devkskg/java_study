package com.gn.practice02;

public class Practice02 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = -62;
		arr[1] = 107;
		arr[2] = -12;
		arr[3] = 89;
		arr[4] = -35;
		
		for(int a : arr) {
			if(a >= 50) {
				System.out.println(a);
			}
		}
	}

}
