package com.gn.practice07;

public class Run {
	public static void main(String[] args) {
//		1) 문제
//	철수네 약국에서 판매중인 영양제를 관리하기 위해 배열을 사용하려고 합니다
//	영양제들은 다음과 같은 정보를 가집니다.
//	이름 : 영양제 이름(예 : 비타민B, 루테인)
//	복용량 : 하루에 몇 알 먹는지(예 : 1알, 2일)
//	가격 : 한병당 가격(예 : 15000원, 20000원)
//	영양제 클래스에 영양제의 정보를 출력하는 메소드를 선언하세요.
//	다음 조건에 따라 객체 배열을 선언, 생성, 초기화한 뒤 배열에 저장된 영양제 정보를 출력하세요.
//	2) 조건
//	영양제를 담을 수 있는 배열을 선언하고 생성하세요.
//	배열의 크기는 4입니다.
//	배열의 각 인덱스에 영양제 객체를 생성하여 초기화하세요.
//	영양제의 메소드를 호출하여 배열에 저장된 모든 영양제의 정보를 출력하세요.
//	3) 사용 데이터
//	   이름 복용량 가격     유산균 1알 18000원   비타민B 1알 15000원   루테인 2알 20000원   비타민D 1알 12000원
//	:전구:
//	클래스명을 제외한 패키지 구조, 접근제한자, 자료형, 필드명, 메소드명, 생성자 등은 직접 설계해보세요.
//	4) 출력 예시
//	========== 영양제 목록 ==========
//	이름: 유산균, 복용량: 1알, 가격: 18000원
//	이름: 비타민B, 복용량: 1알, 가격: 15000원
//	이름: 루테인, 복용량: 2알, 가격: 20000원
//	이름: 비타민D, 복용량: 1알, 가격: 12000원
		
		Supplement[] arr1 = {new Supplement("유산균", 1, 18000), new Supplement("비타민B", 1, 15000),
				new Supplement("루테인", 2, 20000), new Supplement("비타민D", 1, 12000)};
		
		System.out.println("========== 영양제 목록 ==========");
		for(Supplement sup : arr1) {
			sup.list(); 
		}
		
	}

}
