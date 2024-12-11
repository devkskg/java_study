package elice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Elice01 {
	public static void main(String[] args) {
//		화면에서 홀수개의 정수를 입력받아 입력받은 숫자의 평균과 중간값 출력하기
//		999 숫자가 입력된 경우 입력 종료.
//		평균 : 총합/요소의갯수
//		중간값 : 입력받은 숫자를 정렬하여 가운데값
//		[입력]
//		10 40 30 60 30 999
//		[결과]
//		평균:34.0
//		중간값:30
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		List<Integer> arr = new ArrayList<Integer>();
			while(true) {
				num = sc.nextInt();
				arr.add(num);
				if(arr.size() % 2 == 0) {
					if(num == 999) {
						sc.close();
						break;
					}
				}
			}
			
		arr.remove(arr.size()-1);
		
		Collections.sort(arr);
		
		for(int a : arr) {
			sum += a;
		}
		
		int idx = arr.size()-1;
		int midIdx = (idx / 2);
//		System.out.printf("평균:%.1f\n", (double)sum / arr.size());
		System.out.println("평균:" + (double)sum / arr.size());
		System.out.println("중간값:" + arr.get(midIdx));
		
	}
}
