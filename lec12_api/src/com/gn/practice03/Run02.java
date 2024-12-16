package com.gn.practice03;

import java.util.Scanner;

public class Run02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단어를 입력하세요 : ");
		String str = sc.next();

		String sentence = "the quick brown fox jumps over the lazy dog";
		String[] sentArr = sentence.split(" ");

		int z = 0;
		for (int i = 0; i < sentArr.length; i++) {

			if (sentArr[i].equals(str) && i == sentArr.length - 1) {
//				System.out.println(sentArr[i+1]);
				System.out.println("마지막 단어입니다.");
				z++;
			} else if (sentArr[i].equals(str)) {
				System.out.println(sentArr[i] + "다음 단어 : " + sentArr[i + 1]);
				z++;
			} else if (i == sentArr.length - 1 && z == 0) {
				System.out.println("존재하지 않는 단어입니다.");
			}

		}

	}
}
