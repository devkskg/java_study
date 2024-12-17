package com.gn.homework10.TokenController;

public class BuilderController {
	public BuilderController() {
	}

	public String afterReplace(String str) {
		String repstr = str.replace(" ", "");

		return repstr;
	}

	public String firstCap(String input) {
		String result = "";
		result += input.substring(0, 1).toUpperCase();
		result += input.substring(1);
		return result;
	}

	public int findChar(String input, char one) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == one) {
				count++;
			}
		}

		return count;
	}
}
