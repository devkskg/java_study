package com.gn.homework02;

public class Homework02 {
	public static void main(String[] args) {
		try { //아니 이거를 클래스 하나에서 가능한가?
				throw new UnSupportedException("원인을 알 수 없는 오류가 발생했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//	throw new UnSupportedException();
}


class UnSupportedException extends Exception {
	public UnSupportedException(String msg) {
		super(msg);
	}

}