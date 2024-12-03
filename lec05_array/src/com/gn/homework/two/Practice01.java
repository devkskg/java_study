package com.gn.homework.two;

public class Practice01 {
	public void ptc01() {
		int[][] arr = new int[4][4];
		int num = 16;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num;
				num--;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
