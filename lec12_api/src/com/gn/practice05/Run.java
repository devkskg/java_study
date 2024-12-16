package com.gn.practice05;

public class Run {
	public static void main(String[] args) {
		String[] words = { "java", "application", "programming", "interface" };

		for (int i = 0; i < words.length; i++) {
			if (1 <= i && i <= 3) {
				words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);

			}
		}

		System.out.println(String.join(" ", words));

		String strSum = "";
		for (int i = 1; i < words.length; i++) {
			strSum += words[i].charAt(0);
		}
		System.out.println("변환 : " + strSum);
	}
}
