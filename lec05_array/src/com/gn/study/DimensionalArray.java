package com.gn.study;

public class DimensionalArray {
	public static void main(String[] args) {
		
		int score1 = 85;
		int score2 = 90;
		int score3 = 78;
		int score4 = 92;
		int score5 = 88;
		
		int[] scores = {85, 90, 78, 92, 88};
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
//		1. 배열의 선언
		int[] intArr;
		String[] strArr;
		
//		2. 배열의 생성
//		2-1. 선언과 생성 따로
		int[] nums;
		nums = new int[4];
//		2-2. 선언과 생성 동시에
		int[] heights = new int[10];
		
//		3. 배열의 길이(인덱스)
		System.out.println(heights.length + " " + nums.length);
		
//		4. 배열의 초기화(default)
//		char[] chArr = new char[2];
//		System.out.println(chArr[0]);
		System.out.println(heights[2]);
		
//		5. 배열의 초기화(값 변경)
//		5-1. 인덱스 활용
		int[] age1 = new int[3];
		age1[0] = 40;
		age1[1] = 20;
		age1[2] = 70;
		for(int i = 0; i < age1.length; i++) {
			System.out.println(age1[i]);
		}
		
//		5-2. for문 : 규칙O
		int[] age2 = new int[3];
		for(int i = 0; i < age2.length; i++) {
			age2[i] = 10 + i;
			System.out.println(age2[i]);
		}
		
//		5-3. 선언과 동시에 초기화
//		선언 -> (생성) -> 초기화
		int[] age3 = new int[] {1, 2, 3, 4};
		int[] age4 = {5, 6, 7};
//		아래 방법 불가능!!!!
//		int[] element;
//		element = {9, 10, 11};
		
//		6. 배열의 저장과정
//		6-1 선언 : Stack에 score라는 이름의 저장 공간 마련
		int[] score;
//		6-2 생성 : Heap에 기차가 생김, Stack에 기차의 주소값 저장
		score = new int[4];
//		6-3 초기화 : Heap의 값 변경
		score[0] = 90;
		
//		7. 배열의 출력
//		7-1. 인덱스를 이용한 출력
		System.out.println(age1[1]);
		
//		7-2. 반복문을 이용한 출력
		String[] fruits = {"딸기", "체리", "포도"};
		for(int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		
		
		char[] ch1 = {'a', 'b'};
		System.out.println(ch1[0]);
		
//		8.toCharArray
		String text = "Hello World";
		char[] charArr = text.toCharArray();
		for(int i = 0; i < charArr.length; i++) {
			System.out.print(charArr[i]);
		}
		System.out.println();
		
//		vs charAt(i) 뭐가 다른데?
		text = "안녕하세요.";
		for(int i = 0; i < text.length(); i++) {
			System.out.print(text.charAt(i));
		}
		System.out.println();
		
//		9. for each문(혹은 향상된 for문)
		int[] numbers = {1, 2, 3, 4, 5};
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		for(int num : numbers) {
			System.out.println(num);
		}
		
//		10. 배열의 활용 (1) - 총합과 평균
		int[] sus = {83, 90, 100, 100, 50};
		int suSum = 0;
		for(int su : sus) {
			suSum += su;
		}
		System.out.println("배열sus의 합 : " + suSum);
		System.out.println("배열sus의 평균 : " + ((double)suSum / sus.length));
		
//		11. 배열의 활용 (2) - 최대값과 최소값
		int[] arr = {8, 2, 10, 4, 9};
//		최대값 & 최대값
		int max = arr[0];
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		
		
//		12. 배열의 활용 (3) : 오름차순, 내림차순
		int[] data = {8, 4, 1, 3};
//		인덱스 기준 : 0번과 1번 비교 -> 4,8,1,3
//		인덱스 기준 : 0번과 2번 비교 -> 1,8,4,3
//		인덱스 기준 : 0번과 3번 비교 -> 1,8,4,3
//		1번과 2번 비교 -> 1,4,8,3
//		1번과 3번 비교 -> 1,3,8,4
//		2번과 3번 비교 -> 1,3,4,8
//		0 -> 1,2,3
//		1 -> 2,3
//		2 -> 3
		
		for(int i = 0; i < data.length-1; i++) {
			for(int j = i + 1; j < data.length; j++) {
//				System.out.println(i + " " + j);
				if(data[i] > data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
//					약간 삼단논법 느낌인데 
//					i를 temp에 저장해두고 / i는 j 값을 가지게 하고 / j는 temp 값을 가지게 한다.  
				}
			}
		}
		for(int d : data) {
			System.out.print(d + ", ");
		}
		System.out.println();
		
//		1 3 4 8
//		0 vs 1번 : 3 1 4 8
//		0 vs 2번 : 4 1 3 8
//		0 vs 3번 : 8 1 3 4
//		1 vs 2번 : 8 3 1 4
//		1 vs 3번 : 8 4 1 3
//		2 vs 3번 : 8 4 3 1
		
		for(int i = 0; i < data.length-1; i++) {
			for(int j = i + 1; j < data.length; j++) {
				if(data[i] < data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		for(int d : data) {
			System.out.print(d + ", ");
		}
		
		System.out.println("\n=== 배열의 복사 ===");
		
//		13. 배열의 복사
//		(1) 얕은 복사
		int[] arr1 = {5, 6, 7, 8};
//		int[] arr2 = arr1;
//		(2) 깊은 복사
		int[] arr2 = new int[arr1.length];
		System.out.println("\n===깊은 복사===");
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i];
		}
		arr2[3] = 1000;
//		arr2의 인덱스 3번을 바꿨다. 이때 얕은 복사에서는 같은 Heap영역의 데이터를 참조하기 때문에 arr1, arr2 같이 변한다.
		for(int num1 : arr1) {
			if(num1 == arr1[arr1.length - 1]) {
				System.out.println(num1);
			} else {
				System.out.print(num1 + ", ");
			}
		}
		for(int num2 : arr2) {
			System.out.print(num2 + ", ");
		}
		System.out.println();
		
		
		
		
		
	}

}
