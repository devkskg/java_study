package com.gn.practice03;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		String sentence = "the quick brown fox jumps over the lazy dog";
		String[] sentArr = sentence.split(" ");

		int z = 0;
		for (int i = 0; i < sentArr.length; i++) {
			if (sentArr[i].equals(str)) {
				System.out.println(sentArr[i]);
				z++;
			} else if (i == sentArr.length - 1 && z == 0) {
				System.out.println("존재하지 않는 단어입니다.");
			}

		}

//		boolean result = false;
//		for (int i = 0; i < sentArr.length; i++) {
//			if (sentArr[i].equals(str)) {
//				result = true;
//			} else if (i == sentArr.length - 1 && z == 0) {
//				result = false;
//			}
//		}
//		
//		if(result == true) {
//			
//		} esle{
//			
//		}

//		indexOf로도 가능하다.
//		if (sentence.contains(str)) {
//			System.out.println(str);
//		} else {
//			System.out.println("존재하지 않는 단어입니다.");
//		}

	}
}
