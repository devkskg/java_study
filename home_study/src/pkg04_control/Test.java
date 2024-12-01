package pkg04_control;

public class Test {

	public static void main(String[] args) {

		//	if, else if 의 범위 안에 값이 포함이 안되면 콘솔창 아무것도 출력 안됨.
		
		int a= 5;
		
		if(a > 10) {
			System.out.println("10 초과");
		} else if(a > 5) {
			System.out.println("5 초과");
		}
		
		String b = "hi";
		
		if(b.equals("hello")) {
			System.out.println("10 초과");
		} else if("world".equals(b)) {
			System.out.println("5 초과");
		}
	}

}
