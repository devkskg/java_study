package com.gn.practice06;

public class Practice {
	public String method(String str) {
		StringBuilder sb = new StringBuilder("WELCOME TO JAVA");
		sb.append("!");
		sb.insert(0, "<<");
//		sb.delete(10, 11 + 1);

//		내 방법!!
		String[] arr = sb.toString().split(" ");

		String removeStr = arr[arr.length / 2];

		int idx1 = sb.indexOf(removeStr);

		for (int i = 0; i < removeStr.length(); i++) {
			sb.deleteCharAt(idx1);
		}

//		강사님의 방법!!
//		int idx1 = sb.indexOf(" ");
//		int idx2 = sb.lastIndexOf(" ");
//		sb.delete(idx1, idx2);

		sb.reverse();

		return sb.toString();
	}
}
