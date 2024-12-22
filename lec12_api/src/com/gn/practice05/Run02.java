package com.gn.practice05;

public class Run02 {
	public static void main(String[] args) {
		String[] words = {"java", "application", "programming", "interface"};
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < words.length; i++) {
			if(i == words.length - 1) {
				sb.append(words[i]);
			} else {
				sb.append(words[i]).append(" ");
			}
			
		}
		System.out.println("문장 : " + sb);
		
		String str = "";
		for(int i = 1; i < words.length; i++) {
			str += words[i].charAt(0);
		}
		
		System.out.println("변환 : " + str.toUpperCase());
	}
}
