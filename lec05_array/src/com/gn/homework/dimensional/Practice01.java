package com.gn.homework.dimensional;

public class Practice01 {
	public void ptc01() {
		int[] heights = {152, 180, 165, 158, 171};
		int temp = 0;
		for(int i = 0; i < heights.length-1; i++) {
			for(int j = i+1; j < heights.length; j++) {
				if(heights[i] > heights[j]) {
					temp = heights[i];
					heights[i] = heights[j];
					heights[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < heights.length; i++) {
			if(i != heights.length - 1) {
				System.out.print(heights[i] + ", ");
			} else {
				System.out.println(heights[i]);
			}
			
		}
	}

}
