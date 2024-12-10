package com.gn.homework03controller;

import com.gn.homework03.exception.CharCheckException;

public class CharacterController {
	int i = 0;
	int count = 0;
//	char[] arr;
	public CharacterController() {}
	
	public int countAlpha(String s) throws CharCheckException{
//		arr = new char[s.length()];
		for(i = 0; i < s.length(); i++) {
			if('A' <= s.charAt(i)  && s.charAt(i) <= 'Z') {
				count++;
			}else if('a' <= s.charAt(i)  && s.charAt(i) <= 'z') {
				count++;
			}else if(s.charAt(i) == ' ') {
				throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
			}
//			arr[i] = s.charAt(i);
		}
		
		return count;
	}
	
}
