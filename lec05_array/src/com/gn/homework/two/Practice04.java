package com.gn.homework.two;

public class Practice04 {
	public void ptc04() {
		String[][] strArr 
		= new String[][] 
		{{"이", "까", "왔", "앞", "힘"}, 
		{"차", "지", "습", "으", "냅"}, 
		{"원", "열", "니", "로", "시"}, 
		{"배", "심", "다", "좀", "다"}, 
		{"열", "히", "! ", "더", "!! "}};
		
//		00 10 20 30 40
//		01 11 21 31 41 ...
		
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[j][i]);
			}
		}
		
		
		
	}

}
