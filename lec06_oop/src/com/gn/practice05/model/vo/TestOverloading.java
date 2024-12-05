package com.gn.practice05.model.vo;

public class TestOverloading {
//	1) 문제
//	아래에 제시된 메소드들을 보고 위에서 부터 아래로 하나씩 추가한다고 했을 때 오버로딩이 성립되어 오류가 발생하지 않는 메소드는 무엇인가요?
//	IDE에 코드를 작성하지 마시고, 메모장에 코드를 작성한 후 결과를 유추해보세요.
//	:전구:
//	코드는 위에서부터 아래로 읽힌다는 사실을 잊지마세요~
	
//	기준
	public void test(int i){}
	
	public void test(String str){}             // 1번
	public void test(int i, String str){}      // 2번
//	public void test(int num){}                // 3번
//	public char test(int point){}              // 4번
	public void test(int i, int k){}           // 5번
//	public void test(int num, String string){} // 6번
	public void test(String str, int i){}      // 7번
}
