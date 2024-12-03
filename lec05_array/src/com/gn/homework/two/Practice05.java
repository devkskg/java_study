package com.gn.homework.two;

public class Practice05 {
	public void ptc05() {
//		<출석부>
//		1. 강건강 2. 남나나 3. 도대담 4. 류라라 5. 문미미 6. 박보배 
//		7. 송성실 8. 윤예의 9. 진재주 10. 차천축 11. 피풍표 12. 홍하하
		
		String[][] arr0 = {{"강건강", "남나나", "도대담", "류라라", "문미미", "박보배"}, {"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"}};
		int n = 0;
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		System.out.println("== 1분단 ==");
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = arr0[0][n];
				n++;
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		n = 0;
		
		System.out.println("== 2분단 ==");
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = arr0[1][n];
				n++;
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
