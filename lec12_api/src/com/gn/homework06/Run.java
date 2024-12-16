package com.gn.homework06;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		String sentence = "the quick brown fox jumps over the lazy dog";
		String[] arr = sentence.split(" ");

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int z = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(str) && i != arr.length - 1) {
				System.out.println(str + " 다음 단어 : " + arr[i + 1]);
				z++;
				break;
			} else if (i == arr.length - 1 && arr[i].equals(str)) {
				System.out.println("마지막 단어입니다.");
				z++;
			} else if (z == 0 && i == arr.length - 1) {
				System.out.println("존재하지 않는 단어입니다.");
				break;
			}
		}
		sc.close();
	}
}
