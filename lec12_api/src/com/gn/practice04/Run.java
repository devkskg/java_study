package com.gn.practice04;

public class Run {
	public static void main(String[] args) {
		Practice p = new Practice();
		String result = p.deleteBlank(" 화 이 팅 ! ");
		System.out.println(result);

		String result2 = p.deleteBlank2(" 아 자 아 자 파 이 팅 ! ");
		System.out.println(result2);
	}
}
