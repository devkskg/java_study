package com.gn.practice04;

public class Practice {
	public String deleteBlank(String str) {
		str = str.replace(" ", "");
		return str;
	}

	public String deleteBlank2(String str) {
		str = str.trim();
		String[] strArr = str.split(" ");
		String strSum = "";

		for (String s : strArr) {
			strSum += s;
		}

		return strSum;

	}
}
