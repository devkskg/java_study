package com.gn.practice06;

public class Practice02 {
	public String method(StringBuilder sb) {
		String result = null;
		sb.append("!");
		sb.insert(0, "<<");
		int startIdx = sb.indexOf(" ");
		sb.delete(startIdx, startIdx + 2 + 1);
		sb.reverse();
		result = sb.toString();
		return result;
	}
}
