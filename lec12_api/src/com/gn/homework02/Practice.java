package com.gn.homework02;

public class Practice {

	public String takeState(String str) {
		String[] strArr = str.split(" ");
		String result = null;
		for (String st : strArr) {
			if (st.charAt(st.length() - 1) == '구') {
				result = st;
			}
		}
		return result;

	}

}
