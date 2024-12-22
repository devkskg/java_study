package com.gn.practice03;

import java.util.Scanner;

public class Run03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단어를 입력하세요 : ");
		String str = sc.next();
		String sentence = "the quick brown fox jumps over the lazy dog";
		
		String[] arr = sentence.split(" ");
//		일반문제
//		for(int i = 0; i < arr.length; i++) {
//			if(str.equals(arr[i])) {
//				System.out.println(arr[i]);
//				break;
//			}
//		}
		
//		심화문제
		for(int i = 0; i < arr.length; i++) {
			if(str.equals(arr[arr.length - 1])) {
				System.out.println("마지막 단어입니다.");
				break;
			} else if(str.equals(arr[i])) {
				System.out.println(arr[i] + " 다음 단어 : " + arr[i+1]);
			}
		}
		
		
	}
}
