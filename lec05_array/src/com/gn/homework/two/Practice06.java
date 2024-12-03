package com.gn.homework.two;

import java.util.Arrays;
import java.util.Scanner;

public class Practice06 {
	public void ptc06() {
//		<출석부>
//		1. 강건강 2. 남나나 3. 도대담 4. 류라라 5. 문미미 6. 박보배 
//		7. 송성실 8. 윤예의 9. 진재주 10. 차천축 11. 피풍표 12. 홍하하
		String[][] arr0 = {{"강건강", "남나나", "도대담", "류라라", "문미미", "박보배"}, {"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"}};
		int i = 0;
		int j = 0;
		int n = 0;
		
		for(i = 0; i < arr0.length; i++) {
			for(j = 0; j < arr0[i].length; j++) {
				arr0[i][j] = arr0[i][j];
//				System.out.println(arr0[i][j]);
			}
		}
		
		String[] arr1 = new String[(i +1) * (j +1) -1];
		for(i = 0; i < arr0.length; i++) {
			for(j = 0; j < arr0[i].length; j++) {
				arr1[n] = arr0[i][j];
				n++;
			}
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String str = sc.next();
//		System.out.println(Arrays.asList(arr1).indexOf(str));
//		System.out.println(arr1[Arrays.asList(arr0).indexOf(str)]);
		System.out.print("검색하신 " + str + " 학생은 ");
		if(Arrays.asList(arr1).indexOf(str) <= 5) {
			System.out.print("1분단 ");
		} else {
			System.out.print("2분단 ");
		}
		if(Arrays.asList(arr1).indexOf(str) % 6 <= 1) {
			System.out.print("첫 번째 줄 ");
		} else if(1 < Arrays.asList(arr1).indexOf(str) % 6 && Arrays.asList(arr1).indexOf(str) % 6 <= 3) {
			System.out.print("두 번째 줄 ");
		} else {
			System.out.print("세 번째 줄 ");
		}
		if(Arrays.asList(arr1).indexOf(str) % 2 == 0) {
			System.out.print("왼쪽에 있습니다.");
		} else {
			System.out.print("오른쪽에 있습니다.");
		}
	}

}
