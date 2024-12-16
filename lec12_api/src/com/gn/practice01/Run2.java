package com.gn.practice01;

public class Run2 {
	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		int[] srcArr = new int[1000000];
    for (int i = 0; i < srcArr.length; i++) {
    	srcArr[i] = (int) (Math.random() * 100)+1;
    }
    
    int[] desArr = new int[srcArr.length / 2];
    
    
    System.arraycopy(srcArr, 0, desArr, 0, desArr.length);
    
    long endTime = System.currentTimeMillis();
    
    
    for(int i = 0 ; i < desArr.length ; i++) {
    	System.out.print(desArr[i]);
    	if((i+1)%10 ==0) {
    		System.out.print("\n");
    	}else {
    		System.out.print(",");
    	}
    }
    System.out.println("복사 작업 소요 시간: " + (endTime - startTime) + "ms");
	
	}
}
