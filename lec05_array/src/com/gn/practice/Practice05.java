package com.gn.practice;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scores = {54,23};
		int[] newScores = new int[scores.length + 1];
		System.out.print("길동이 : ");
		int num = sc.nextInt();
		newScores[2] = num;
		int sum = 0;
		
//		for(int i = 0; i < scores.length; i++) {
//			newScores[i] = scores[i];
//		}
		
		for(int i = 0; i < newScores.length; i++) {
			if(i < newScores.length - 1) {
				newScores[i] = scores[i];
			}
			System.out.println(newScores[i]);
			sum += newScores[i];
		}
		
		int average = sum / newScores.length;
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + average);
		sc.close();

	}

}
